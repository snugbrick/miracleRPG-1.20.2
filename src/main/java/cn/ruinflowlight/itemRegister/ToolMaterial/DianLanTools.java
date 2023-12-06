package cn.ruinflowlight.itemRegister.ToolMaterial;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 02:12
 */
public class DianLanTools implements ToolMaterial {
    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 8.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.POTATO);
    }
}
