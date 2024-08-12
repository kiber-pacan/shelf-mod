package com.akicater;

import com.akicater.blocks.FloorShelf;
import com.akicater.blocks.Shelf;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
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

	public static final Shelf SHELF_OAK = new Shelf(AbstractBlock.Settings.create().nonOpaque());
	public static final FloorShelf FLOOR_SHELF_OAK = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_ACACIA = new Shelf(AbstractBlock.Settings.create().nonOpaque());
	public static final FloorShelf FLOOR_SHELF_ACACIA = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_BIRCH = new Shelf(AbstractBlock.Settings.create().nonOpaque());
	public static final FloorShelf FLOOR_SHELF_BIRCH = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_DARK_OAK = new Shelf(AbstractBlock.Settings.create().nonOpaque());
	public static final FloorShelf FLOOR_SHELF_DARK_OAK = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

	public static final Shelf SHELF_SPRUCE = new Shelf(AbstractBlock.Settings.create().nonOpaque());
	public static final FloorShelf FLOOR_SHELF_SPRUCE = new FloorShelf(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque());

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

	public static final ItemGroup GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(SHELF_OAK))
			.displayName(Text.of("Shelf mod"))
			.entries((context, entries) -> {
				entries.add(SHELF_OAK);
				entries.add(FLOOR_SHELF_OAK);
			})
			.build();

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

		Registry.register(Registries.BLOCK, new Identifier(MODID, "shelf_dark_spruce"), SHELF_SPRUCE);
		Registry.register(Registries.BLOCK, new Identifier(MODID, "floor_shelf_spruce"), FLOOR_SHELF_SPRUCE);

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

	}
}