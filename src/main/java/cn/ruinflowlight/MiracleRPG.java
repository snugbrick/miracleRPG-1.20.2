package cn.ruinflowlight;

import cn.ruinflowlight.ArmorReg.AusterityArmor;
import cn.ruinflowlight.ArmorReg.AusterityReg;
import cn.ruinflowlight.BlocksReg.BiYuKuang;
import cn.ruinflowlight.itemRegister.DianLanItemReg;
import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import cn.ruinflowlight.itemGroupReg.RPGitemGroup;
import cn.ruinflowlight.itemRegister.simpleItem;
import cn.ruinflowlight.listener.PlayerRightClickLis;
import cn.ruinflowlight.miracleEnchant.MiracleSharp;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cn.ruinflowlight.itemGroupReg.simpleItemsGroupReg.pullFieldInItem;

/**
 * 本mod由于遗留原因，大量采用拼音命名法，主打一个炫酷
 * 
 * 正在移植ing
 * */
public class MiracleRPG implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");

    @Override
    public void onInitialize() {
        LOGGER.info("MiracleRPG has been initialized!");
        biLvitemReg.registerItem();
        chiHongXiLieReg.registerItem();
        DianLanItemReg.registerItem();//物品注册
        simpleItem.ItemsRegister();

        AusterityReg.ArmorRegister();//盔甲注册

        BiYuKuang.BlocksRegister();//方块注册

        RPGitemGroup.GroupRegister();//物品组注册

        MiracleSharp MS=new MiracleSharp();
        MS.EnchantRegister();//附魔注册

        ListenerReg();//监听器注册

        pullFieldInItem();//将simpleItem压入数组

    }
    private void ListenerReg(){
        UseItemCallback.EVENT.register(new PlayerRightClickLis());
    }
}