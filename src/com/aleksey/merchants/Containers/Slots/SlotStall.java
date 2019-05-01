package com.aleksey.merchants.Containers.Slots;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotStall extends Slot
{
    public SlotStall(IInventory iinventory, int slotIndex, int x, int y)
    {
        super(iinventory, slotIndex, x, y);
    }

    @Override
    public boolean isItemValid(ItemStack itemstack)
    {       
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean func_111238_b()
    {
        return false;
    }
}