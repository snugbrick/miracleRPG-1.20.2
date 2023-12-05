package cn.ruinflowlight.itemRegister.itemGroupReg;

import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 04:02
 */
public class itemGroupRegister {
    public static void itemGroupReg() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(biLvitemReg.biLvZhiRen);
            content.add(biLvitemReg.biLvZhiRen2);
            content.add(biLvitemReg.biLvZhiRen3);
            content.add(biLvitemReg.biLvZhiRen4);

            content.add(chiHongXiLieReg.chiHongZhiRen);
            content.add(chiHongXiLieReg.chiHongZhiRen2);
            content.add(chiHongXiLieReg.chiHongZhiRen3);
            content.add(chiHongXiLieReg.ChiHongZhiRen4);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(biLvitemReg.biLvZhiZheng);

            content.add(chiHongXiLieReg.chiHongBaoShi);
            content.add(chiHongXiLieReg.chiHongKuangShi);
        });
    }
}
