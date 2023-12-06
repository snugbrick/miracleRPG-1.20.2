package cn.ruinflowlight.itemRegister;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.05 17:11
 * <p>
 * 注册物品的方法  不推荐使用 :)
 */
@Deprecated
public class itemRegHelper {
    public static void itemReg(Registry<Item> registry, Identifier identifier, Item item) {
        Registry.register(registry, identifier, item);
    }
}
