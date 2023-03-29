package net.celsiusqc.createaddon.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.Map;

public class DrillRightClickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 400, 5, (false), (false)));
			(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
		} else {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.VANISHING_CURSE, itemstack) != 0)) {
			(itemstack).enchant(Enchantments.VANISHING_CURSE, 1);
		}
	}
}
