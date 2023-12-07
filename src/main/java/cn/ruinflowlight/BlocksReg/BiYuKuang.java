package cn.ruinflowlight.BlocksReg;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 09:03
 */
public class BiYuKuang {
    public static final Block BiYuKuangShi = new Block(FabricBlockSettings.create().strength(4.0f));

    public static void BlocksRegister(){
        Registry.register(Registries.BLOCK, new Identifier("miraclerpg", "biyukuang"), BiYuKuangShi);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg", "biyukuang"), new BlockItem(BiYuKuangShi, new FabricItemSettings()));
    }
}
