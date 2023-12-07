package cn.ruinflowlight;

import cn.ruinflowlight.itemRegister.DingLanItemReg;
import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import cn.ruinflowlight.itemRegister.itemGroupReg.RPGitemGroup;
import cn.ruinflowlight.listener.PlayerRightClickLis;
import cn.ruinflowlight.miracleEnchant.MiracleSharp;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 本mod由于遗留原因，大量采用拼音命名法，主打一个炫酷
 * 
 * 正在移植ing
 * */
public class MiracleRPG implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");

    public static Enchantment miracleSharp = new MiracleSharp();
    @Override
    public void onInitialize() {
        LOGGER.info("MiracleRPG has been initialized!");
        biLvitemReg.registerItem();
        chiHongXiLieReg.registerItem();
        DingLanItemReg.registerItem();

        RPGitemGroup.GroupRegister();

        Registry.register(Registries.ENCHANTMENT, new Identifier("miraclerpg", "miracle_sharp"), miracleSharp);

        ListenerReg();

    }
    private void ListenerReg(){
        UseItemCallback.EVENT.register(new PlayerRightClickLis());
    }
}