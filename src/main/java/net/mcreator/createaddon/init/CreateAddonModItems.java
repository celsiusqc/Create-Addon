
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.createaddon.item.BrassDrillItem;
import net.mcreator.createaddon.CreateAddonMod;

public class CreateAddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateAddonMod.MODID);
	public static final RegistryObject<Item> BRASS_DRILL = REGISTRY.register("brass_drill", () -> new BrassDrillItem());
}
