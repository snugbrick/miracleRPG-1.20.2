package cn.ruinflowlight.listener;

import cn.ruinflowlight.itemRegister.biLvitemReg;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * @author MiracleUR -> github.com/snugbrick
 * @version 1.0.0 2023.12.07 00:20
 */
public class PlayerRightClickLis implements UseItemCallback {

    @Override
    public TypedActionResult<ItemStack> interact(PlayerEntity player, World world, Hand hand) {
        ItemStack heldItem = player.getStackInHand(hand);

        if(!world.isClient){
            return TypedActionResult.pass(ItemStack.EMPTY);
        }

        if (heldItem.getItem() == biLvitemReg.biLvZhiRen4) {
            if (player.isUsingItem() && player.getActiveHand() == hand) {
                player.sendMessage(Text.of("wow"));
            }
        }

        return TypedActionResult.success(ItemStack.EMPTY);
    }
}
