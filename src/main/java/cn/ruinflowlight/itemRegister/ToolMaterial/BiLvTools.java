package cn.ruinflowlight.itemRegister.ToolMaterial;

import cn.ruinflowlight.itemRegister.biLvitemReg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Rarity;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 21:44
 */
public class BiLvTools implements ToolMaterial {
/*
    extend Item

    public BiLvTools(Settings settings) {
        super(settings);
    }
    @Override
    public boolean isFireproof(){
        return true;
    }
    @Override
    public Rarity getRarity(ItemStack stack){
        return Rarity.RARE;
    }
 */

    //上面是Item的重写，下面是ToolMaterial的实现

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
        return Ingredient.ofItems(biLvitemReg.biLvZhiZheng);
    }
}
