
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.celsiusqc.createaddon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.celsiusqc.createaddon.client.model.Modelencasedjet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreateAddonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelencasedjet.LAYER_LOCATION, Modelencasedjet::createBodyLayer);
	}
}
