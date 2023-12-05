package cn.ruinflowlight;

import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import cn.ruinflowlight.itemRegister.itemGroupReg.RPGitemGroup;
import cn.ruinflowlight.itemRegister.itemGroupReg.itemGroupRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiracleRPG implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miraclerpg");

    @Override
    public void onInitialize() {
        LOGGER.info("MiracleRPG has been initialized!");
        biLvitemReg.registerItem();
        chiHongXiLieReg.registerItem();

        RPGitemGroup.GroupRegister();

        itemGroupRegister.itemGroupReg();
    }
}