package cn.ruinflowlight.itemRegister;

import cn.ruinflowlight.itemRegister.itemType.biLvXiLieItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.05 17:17
 */
public class biLvitemReg {
    public static final biLvXiLieItem biLvZhiRen = new biLvXiLieItem(new FabricItemSettings()
            .maxDamage(6));
    public static final biLvXiLieItem biLvZhiRen2 = new biLvXiLieItem(new FabricItemSettings()
            .maxDamage(8));
    public static final biLvXiLieItem biLvZhiRen3 = new biLvXiLieItem(new FabricItemSettings()
            .maxDamage(10));
    public static final biLvXiLieItem biLvZhiRen4 = new biLvXiLieItem(new FabricItemSettings()
            .maxDamage(12));
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
