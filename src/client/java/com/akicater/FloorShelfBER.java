package com.akicater;

import com.akicater.blocks.FloorShelfBlockEntity;
import com.akicater.blocks.ShelfBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import org.joml.Quaternionf;

import java.util.ArrayList;
import java.util.List;

public class FloorShelfBER implements BlockEntityRenderer<FloorShelfBlockEntity> {
    public List<Vec3d> positions = new ArrayList<>(
            List.of(
                    new Vec3d(0.2627F, 0.2F, 0.2627F),
                    new Vec3d(0.7373F, 0.2F, 0.2627F),
                    new Vec3d(0.2627F, 0.2F, 0.7373F),
                    new Vec3d(0.7373F, 0.2F, 0.7373F)
            )
    );

    public Quaternionf getRotation(Direction direction) {
        return switch (direction) {
            case NORTH -> RotationAxis.POSITIVE_Y.rotationDegrees(0);
            case EAST -> RotationAxis.POSITIVE_Y.rotationDegrees(270);
            case SOUTH -> RotationAxis.POSITIVE_Y.rotationDegrees(180);
            case WEST -> RotationAxis.POSITIVE_Y.rotationDegrees(90);
            default -> null;
        };
    }

    public FloorShelfBER(BlockEntityRendererFactory.Context ctx) {}

    static int getLight(World world, BlockPos pos){
        return LightmapTextureManager.pack(world.getLightLevel(LightType.BLOCK, pos), world.getLightLevel(LightType.SKY, pos));
    }

    @Override
    public void render(FloorShelfBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        BlockState state;
        World world = entity.getWorld();

        if ((state = world.getBlockState(entity.getPos())).getBlock() == Blocks.AIR) return;
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

        Quaternionf quaternionf = getRotation(state.get(Properties.HORIZONTAL_FACING));

        int x = getLight(world, entity.getPos());

        for (int i = 0; i < 4; i++) {
            ItemStack stack = entity.inventory.get(i);
            if(!stack.isEmpty()) {
                Vec3d pos = positions.get(i);

                matrices.push();

                matrices.translate(pos.x, pos.y, pos.z);
                matrices.scale(0.40625f, 0.40625f, 0.40625f);

                matrices.multiply(quaternionf);
                matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90));

                itemRenderer.renderItem(stack, ModelTransformationMode.FIXED, x, overlay, matrices, vertexConsumers, entity.getWorld(), 1);

                matrices.pop();
            }
        }
    }
}