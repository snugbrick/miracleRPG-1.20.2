package cn.ruinflowlight.itemRegister;

import cn.ruinflowlight.itemRegister.ToolMaterial.BiLvTools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.05 17:17
 *
 * 碧绿系列武器装备
 */
public class biLvitemReg {
    public static final ToolItem biLvZhiRen = new SwordItem( new BiLvTools(),
            8, -2.4F,
            new Item.Settings());
    public static final ToolItem biLvZhiRen2 = new SwordItem(new BiLvTools(),
            10,-2.4F,
            new Item.Settings());
    public static final ToolItem biLvZhiRen3 = new SwordItem(new BiLvTools(),
            12,-2.4F,
            new Item.Settings());
    public static final ToolItem biLvZhiRen4 = new SwordItem(new BiLvTools(),
            14,-2.4F,
            new Item.Settings());
    public static final Item biLvZhiZheng = new Item(new FabricItemSettings()
            .maxCount(64));

    public static void registerItem() {
        itemRegHelper.itemReg(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren"), biLvZhiRen);
        itemRegHelper.itemReg(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren2"), biLvZhiRen2);
        itemRegHelper.itemReg(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren3"), biLvZhiRen3);
        itemRegHelper.itemReg(Registries.ITEM, new Identifier("miraclerpg", "bilvzhiren4"), biLvZhiRen4);
        itemRegHelper.itemReg(Registries.ITEM, new Identifier("miraclerpg", "bilvzhizheng"), biLvZhiZheng);
    }
}
