package cn.ruinflowlight.itemGroupReg;

import cn.ruinflowlight.itemRegister.simpleItem;
import net.minecraft.item.Item;

import java.lang.reflect.Field;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 15:18
 */
public class simpleItemsGroupReg {
    public static final Class<simpleItem> ItemsClass = simpleItem.class;
    public static final Field[] ItemsField = ItemsClass.getDeclaredFields();
    public static final Item[] simpleItems = new Item[ItemsField.length];

    public static void pullFieldInItem(){//将类中的域压入数组
        for (Field field : ItemsField) {
            try {
                field.setAccessible(true);
                for (int i = 0; i < ItemsField.length; i++) {
                    simpleItems[i] = (Item) ItemsField[i].get(ItemsClass);
                }
            } catch (IllegalAccessException | IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }
}
