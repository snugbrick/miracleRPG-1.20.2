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
public class DianLanItemReg {
    public static final ToolItem dianlanzhiren
            =new SwordItem(new DianLanTools(),8,-2.4F,
            new Item.Settings());
    public static final ToolItem dianlanzhiren2
            =new SwordItem(new DianLanTools(),10,-2.4F,
            new Item.Settings());
    public static final ToolItem dianlanzhiren3
            =new SwordItem(new DianLanTools(),12,-2.4F,
            new Item.Settings());
    public static final ToolItem dianlanzhiren4
            =new SwordItem(new DianLanTools(),14,-2.4F,
            new Item.Settings());
    public static void registerItem(){
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren"), dianlanzhiren);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren2"), dianlanzhiren2);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren3"), dianlanzhiren3);
        Registry.register(Registries.ITEM, new Identifier("miraclerpg","dianlanzhiren4"), dianlanzhiren4);
    }
}
