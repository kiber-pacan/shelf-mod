package com.akicater;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ShelfmodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(Shelfmod.SHELF_BLOCK_ENTITY, ShelfBER::new);
	}
}