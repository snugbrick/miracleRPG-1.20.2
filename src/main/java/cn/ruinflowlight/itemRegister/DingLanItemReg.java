package cn.ruinflowlight.itemRegister;

import cn.ruinflowlight.itemRegister.ToolMaterial.DianLanTools;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 02:13
 */
public class DingLanItemReg {
    public static final ToolItem dinglanzhiren
            =new SwordItem(new DianLanTools(),8,-2.4F,
            new Item.Settings());
    public static final ToolItem dinglanzhiren2
            =new SwordItem(new DianLanTools(),10,-2.4F,
            new Item.Settings());
    public static final ToolItem dinglanzhiren3
            =new SwordItem(new DianLanTools(),12,-2.4F,
            new Item.Settings());
    public static final ToolItem dinglanzhiren4
            =new SwordItem(new DianLanTools(),14,-2.4F,
            new Item.Settings());
    public static void registerItem(){
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dinglanzhiren"), dinglanzhiren);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dinglanzhiren2"), dinglanzhiren2);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dinglanzhiren3"), dinglanzhiren3);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dinglanzhiren4"), dinglanzhiren4);
    }
}
