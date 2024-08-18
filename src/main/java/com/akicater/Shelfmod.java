package com.akicater;

import com.akicater.blocks.FloorShelf;
import com.akicater.blocks.FloorShelfBlockEntity;
import com.akicater.blocks.Shelf;
import com.akicater.blocks.ShelfBlockEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Shelfmod implements ModInitializer {
	public static final String MODID = "shelf-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("shelf-mod");

	public static final Shelf SHELF_OAK = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_OAK = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_ACACIA = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_ACACIA = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_BIRCH = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_BIRCH = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_DARK_OAK = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_DARK_OAK = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_SPRUCE = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_SPRUCE = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_JUNGLE = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_JUNGLE = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_MANGROVE = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_MANGROVE = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_BAMBOO = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_BAMBOO = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_WARPED = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_WARPED = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_CHERRY = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_CHERRY = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_CRIMSON = new Shelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
	public static final FloorShelf FLOOR_SHELF_CRIMSON = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final BlockItem SHELF_ITEM_OAK = new BlockItem(SHELF_OAK, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_OAK = new BlockItem(FLOOR_SHELF_OAK, new Item.Settings());

	public static final BlockItem SHELF_ITEM_ACACIA = new BlockItem(SHELF_ACACIA, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_ACACIA = new BlockItem(FLOOR_SHELF_ACACIA, new Item.Settings());

	public static final BlockItem SHELF_ITEM_BIRCH = new BlockItem(SHELF_BIRCH, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_BIRCH = new BlockItem(FLOOR_SHELF_BIRCH, new Item.Settings());

	public static final BlockItem SHELF_ITEM_DARK_OAK = new BlockItem(SHELF_DARK_OAK, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_DARK_OAK = new BlockItem(FLOOR_SHELF_DARK_OAK, new Item.Settings());

	public static final BlockItem SHELF_ITEM_SPRUCE = new BlockItem(SHELF_SPRUCE, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_SPRUCE = new BlockItem(FLOOR_SHELF_SPRUCE, new Item.Settings());

	public static final BlockItem SHELF_ITEM_JUNGLE = new BlockItem(SHELF_JUNGLE, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_JUNGLE = new BlockItem(FLOOR_SHELF_JUNGLE, new Item.Settings());

	public static final BlockItem SHELF_ITEM_MANGROVE = new BlockItem(SHELF_MANGROVE, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_MANGROVE = new BlockItem(FLOOR_SHELF_MANGROVE, new Item.Settings());

	public static final BlockItem SHELF_ITEM_BAMBOO = new BlockItem(SHELF_BAMBOO, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_BAMBOO = new BlockItem(FLOOR_SHELF_BAMBOO, new Item.Settings());

	public static final BlockItem SHELF_ITEM_WARPED = new BlockItem(SHELF_WARPED, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_WARPED = new BlockItem(FLOOR_SHELF_WARPED, new Item.Settings());

	public static final BlockItem SHELF_ITEM_CHERRY = new BlockItem(SHELF_CHERRY, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_CHERRY = new BlockItem(FLOOR_SHELF_CHERRY, new Item.Settings());

	public static final BlockItem SHELF_ITEM_CRIMSON = new BlockItem(SHELF_CRIMSON, new Item.Settings());
	public static final BlockItem FLOOR_SHELF_ITEM_CRIMSON = new BlockItem(FLOOR_SHELF_CRIMSON, new Item.Settings());

	public static final ItemGroup GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(SHELF_OAK))
			.displayName(Text.of("Shelf mod"))
			.entries((context, entries) -> {
				entries.add(SHELF_ITEM_OAK);
				entries.add(FLOOR_SHELF_ITEM_OAK);

				entries.add(SHELF_ITEM_ACACIA);
				entries.add(FLOOR_SHELF_ITEM_ACACIA);

				entries.add(SHELF_ITEM_BIRCH);
				entries.add(FLOOR_SHELF_ITEM_BIRCH);

				entries.add(SHELF_ITEM_DARK_OAK);
				entries.add(FLOOR_SHELF_ITEM_DARK_OAK);

				entries.add(SHELF_ITEM_SPRUCE);
				entries.add(FLOOR_SHELF_ITEM_SPRUCE);

				entries.add(SHELF_ITEM_JUNGLE);
				entries.add(FLOOR_SHELF_ITEM_JUNGLE);

				entries.add(SHELF_ITEM_MANGROVE);
				entries.add(FLOOR_SHELF_ITEM_MANGROVE);

				entries.add(SHELF_ITEM_BAMBOO);
				entries.add(FLOOR_SHELF_ITEM_BAMBOO);

				entries.add(SHELF_ITEM_WARPED);
				entries.add(FLOOR_SHELF_ITEM_WARPED);

				entries.add(SHELF_ITEM_CHERRY);
				entries.add(FLOOR_SHELF_ITEM_CHERRY);

				entries.add(SHELF_ITEM_CRIMSON);
				entries.add(FLOOR_SHELF_ITEM_CRIMSON);
			})
			.build();

	public static final BlockEntityType<ShelfBlockEntity> SHELF_BLOCK_ENTITY = Registry.register(
			Registries.BLOCK_ENTITY_TYPE,
			Identifier.of(MODID, "shelf_block_entity"),
			BlockEntityType.Builder.create(
					ShelfBlockEntity::new,
					SHELF_OAK, SHELF_ACACIA, SHELF_BIRCH, SHELF_DARK_OAK, SHELF_SPRUCE, SHELF_JUNGLE, SHELF_MANGROVE, SHELF_BAMBOO, SHELF_WARPED, SHELF_CHERRY, SHELF_CRIMSON
			).build(null)
	);

	public static final BlockEntityType<FloorShelfBlockEntity> FLOOR_SHELF_BLOCK_ENTITY = Registry.register(
			Registries.BLOCK_ENTITY_TYPE,
			Identifier.of(MODID, "floor_shelf_block_entity"),
			BlockEntityType.Builder.create(
					FloorShelfBlockEntity::new,
					FLOOR_SHELF_OAK, FLOOR_SHELF_ACACIA, FLOOR_SHELF_BIRCH, FLOOR_SHELF_DARK_OAK, FLOOR_SHELF_SPRUCE, FLOOR_SHELF_JUNGLE, FLOOR_SHELF_MANGROVE, FLOOR_SHELF_BAMBOO, FLOOR_SHELF_WARPED, FLOOR_SHELF_CHERRY, FLOOR_SHELF_CRIMSON
			).build(null)
	);

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, new Identifier("tutorial", "test_group"), GROUP);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_oak"), SHELF_OAK);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_oak"), FLOOR_SHELF_OAK);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_acacia"), SHELF_ACACIA);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_acacia"), FLOOR_SHELF_ACACIA);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_birch"), SHELF_BIRCH);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_birch"), FLOOR_SHELF_BIRCH);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_dark_oak"), SHELF_DARK_OAK);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_dark_oak"), FLOOR_SHELF_DARK_OAK);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_spruce"), SHELF_SPRUCE);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_spruce"), FLOOR_SHELF_SPRUCE);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_jungle"), SHELF_JUNGLE);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_jungle"), FLOOR_SHELF_JUNGLE);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_mangrove"), SHELF_MANGROVE);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_mangrove"), FLOOR_SHELF_MANGROVE);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_bamboo"), SHELF_BAMBOO);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_bamboo"), FLOOR_SHELF_BAMBOO);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_warped"), SHELF_WARPED);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_warped"), FLOOR_SHELF_WARPED);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_cherry"), SHELF_CHERRY);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_cherry"), FLOOR_SHELF_CHERRY);

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_crimson"), SHELF_CRIMSON);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_crimson"), FLOOR_SHELF_CRIMSON);


		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_oak"), SHELF_ITEM_OAK);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_oak"), FLOOR_SHELF_ITEM_OAK);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_acacia"), SHELF_ITEM_ACACIA);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_acacia"), FLOOR_SHELF_ITEM_ACACIA);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_birch"), SHELF_ITEM_BIRCH);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_birch"), FLOOR_SHELF_ITEM_BIRCH);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_dark_oak"), SHELF_ITEM_DARK_OAK);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_dark_oak"), FLOOR_SHELF_ITEM_DARK_OAK);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_spruce"), SHELF_ITEM_SPRUCE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_spruce"), FLOOR_SHELF_ITEM_SPRUCE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_jungle"), SHELF_ITEM_JUNGLE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_jungle"), FLOOR_SHELF_ITEM_JUNGLE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_mangrove"), SHELF_ITEM_MANGROVE);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_mangrove"), FLOOR_SHELF_ITEM_MANGROVE);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_bamboo"), SHELF_ITEM_BAMBOO);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_bamboo"), FLOOR_SHELF_ITEM_BAMBOO);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_warped"), SHELF_ITEM_WARPED);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_warped"), FLOOR_SHELF_ITEM_WARPED);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_cherry"), SHELF_ITEM_CHERRY);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_cherry"), FLOOR_SHELF_ITEM_CHERRY);

		Registry.register(Registries.ITEM, new Identifier(MODID, "shelf_item_crimson"), SHELF_ITEM_CRIMSON);
		Registry.register(Registries.ITEM, new Identifier(MODID, "floor_shelf_item_crimson"), FLOOR_SHELF_ITEM_CRIMSON);
	}
}