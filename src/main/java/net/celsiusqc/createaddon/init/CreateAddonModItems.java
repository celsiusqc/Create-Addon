
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.celsiusqc.createaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.celsiusqc.createaddon.item.FanPoweredBrassChestplateItem;
import net.celsiusqc.createaddon.item.BrassDrillItem;
import net.celsiusqc.createaddon.CreateAddonMod;

public class CreateAddonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateAddonMod.MODID);
	public static final RegistryObject<Item> BRASS_DRILL = REGISTRY.register("brass_drill", () -> new BrassDrillItem());
	public static final RegistryObject<Item> FAN_POWERED_BRASS_CHESTPLATE_CHESTPLATE = REGISTRY.register("fan_powered_brass_chestplate_chestplate", () -> new FanPoweredBrassChestplateItem.Chestplate());
}
