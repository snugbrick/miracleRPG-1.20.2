package cn.ruinflowlight.itemRegister;

import cn.ruinflowlight.itemRegister.itemType.chiHongXiLieItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 03:46
 */
public class chiHongXiLieReg {
    public static final chiHongXiLieItem chiHongZhiRen = new chiHongXiLieItem(new FabricItemSettings()
            .maxDamage(6));
    public static final chiHongXiLieItem chiHongZhiRen2 = new chiHongXiLieItem(new FabricItemSettings()
            .maxDamage(8));
    public static final chiHongXiLieItem chiHongZhiRen3 = new chiHongXiLieItem(new FabricItemSettings()
            .maxDamage(10));
    public static final chiHongXiLieItem ChiHongZhiRen4 = new chiHongXiLieItem(new FabricItemSettings()
            .maxDamage(12));
    public static final Item chiHongBaoShi = new Item(new FabricItemSettings()
            .maxCount(64));
    public static final Item chiHongKuangShi = new Item(new FabricItemSettings()
            .maxCount(64));

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "chihongzhiren"), chiHongZhiRen);
        Registry.register(Registries.ITEM,new Identifier("miraclerpg","chihongzhiren2"),chiHongZhiRen2);
        Registry.register(Registries.ITEM,new Identifier("miraclerpg","chihongzhiren3"),chiHongZhiRen3);
        Registry.register(Registries.ITEM,new Identifier("miraclerpg","chihongzhiren4"),ChiHongZhiRen4);
        Registry.register(Registries.ITEM,new Identifier("miraclerpg","chihongbaoshi"),chiHongBaoShi);
        Registry.register(Registries.ITEM,new Identifier("miraclerpg","chihongkuangshi"),chiHongKuangShi);
    }
}
