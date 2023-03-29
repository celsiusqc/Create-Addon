package net.celsiusqc.createaddon.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.celsiusqc.createaddon.init.CreateAddonModItems;

import java.util.Map;

public class JetPackProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CreateAddonModItems.FAN_POWERED_BRASS_CHESTPLATE_CHESTPLATE.get()) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.JUMP) : false)) {
				if (entity.isOnGround()) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 2, (false), (false)));
				}
			}
			if (!entity.isOnGround()) {
				if (!entity.isPassenger()) {
					if (!entity.isInWater()) {
						if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isSleeping() : false)) {
							if (entity.isShiftKeyDown()) {
								if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.SLOW_FALLING) : false)) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 3, (false), (false)));
								}
							}
						}
					}
				}
			}
			if (entity.isInWater()) {
				if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.DEPTH_STRIDER, itemstack) != 0)) {
					(itemstack).enchant(Enchantments.DEPTH_STRIDER, 3);
				}
			} else {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.DEPTH_STRIDER, itemstack) != 0) {
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
							_enchantments.remove(Enchantments.DEPTH_STRIDER);
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
				}
			}
		}
	}
}
