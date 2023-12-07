package cn.ruinflowlight.itemRegister.itemGroupReg;

import cn.ruinflowlight.itemRegister.DianLanItemReg;
import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import cn.ruinflowlight.itemRegister.simpleItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static cn.ruinflowlight.itemRegister.biLvitemReg.biLvZhiZheng;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.06 04:48
 */
public class RPGitemGroup {
    public static void GroupRegister() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("miraclerpg", "combat_group"), rgpItemGroup);
    }

    private static final ItemGroup rgpItemGroup = FabricItemGroup.builder()
            .icon(() -> new ItemStack(biLvZhiZheng))
            .displayName(Text.translatable("奇迹RPG物品"))
            .entries((context, entries) -> {
                entries.add(biLvitemReg.biLvZhiRen);
                entries.add(biLvitemReg.biLvZhiRen2);
                entries.add(biLvitemReg.biLvZhiRen3);
                entries.add(biLvitemReg.biLvZhiRen4);

                entries.add(chiHongXiLieReg.chiHongZhiRen);
                entries.add(chiHongXiLieReg.chiHongZhiRen2);
                entries.add(chiHongXiLieReg.chiHongZhiRen3);
                entries.add(chiHongXiLieReg.ChiHongZhiRen4);

                entries.add(DianLanItemReg.dianlanzhiren);
                entries.add(DianLanItemReg.dianlanzhiren2);
                entries.add(DianLanItemReg.dianlanzhiren3);
                entries.add(DianLanItemReg.dianlanzhiren4);

                entries.add(DianLanItemReg.dianLanDing);
                entries.add(DianLanItemReg.dianLanBaoShi);
                entries.add(chiHongXiLieReg.chiTieDing);


                entries.add(biLvitemReg.biLvZhiZheng);
                entries.add(chiHongXiLieReg.chiHongBaoShi);
               entries.add(chiHongXiLieReg.chiHongKuangShi);

               for(Item item:simpleItemsGroupReg.simpleItems){
                   entries.add(item);
               }
/*
                entries.add(simpleItem.chiLun0);
                entries.add(simpleItem.chilun1);
                entries.add(simpleItem.chilun3);
                entries.add(simpleItem.chilun4);
                entries.add(simpleItem.chilun5);

                entries.add(simpleItem.chuJiJingHua);
                entries.add(simpleItem.zhongJiJingHua);
                entries.add(simpleItem.gaoJiJingHua);
                entries.add(simpleItem.ziRanJingHua);
                entries.add(simpleItem.chuangWeiJingHua);

                entries.add(simpleItem.buRongBing);

 */
            })
            .build();

}
