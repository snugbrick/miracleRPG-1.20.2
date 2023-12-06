package cn.ruinflowlight;

import cn.ruinflowlight.itemRegister.biLvitemReg;
import cn.ruinflowlight.itemRegister.chiHongXiLieReg;
import cn.ruinflowlight.itemRegister.itemGroupReg.RPGitemGroup;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

        RPGitemGroup.GroupRegister();
    }
}