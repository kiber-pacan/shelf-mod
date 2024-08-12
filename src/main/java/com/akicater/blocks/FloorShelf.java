package com.akicater.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import static net.minecraft.block.BarrelBlock.FACING;

public class FloorShelf extends HorizontalFacingBlock implements Waterloggable {
    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public FloorShelf(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView blockView, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH, SOUTH:
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1f, 0.3125f, 1f),
                        VoxelShapes.cuboid(0.0f, 0.3125f, 0.3125f, 0.0625f, 0.5f, 0.6875f),
                        VoxelShapes.cuboid(0.9375f, 0.3125f, 0.3125f, 1.0f, 0.5f, 0.6875f)
                );
            case EAST, WEST:
                return VoxelShapes.union(
                        VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1f, 0.3125f, 1f),
                        VoxelShapes.cuboid(0.3125f, 0.3125f, 0.0f, 0.6875f, 0.5f, 0.0625f),
                        VoxelShapes.cuboid(0.3125f, 0.3125f, 0.9375f, 0.6875f, 0.5f, 1.0f)

                );
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED).add(Properties.HORIZONTAL_FACING);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
}
