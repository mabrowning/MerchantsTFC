package com.aleksey.merchants.WarehouseContainers;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import sladki.tfc.TileEntities.TECellarShelf;

import com.aleksey.merchants.WarehouseContainers.ChestContainer;
import com.dunk.tfc.Containers.Slots.SlotFoodOnly;

public class CellarShelfContainer extends ChestContainer
{
    @Override
    public boolean isValid(TileEntity tileEntity)
    {
        return tileEntity.getClass() == TECellarShelf.class;
    }
    
    @Override
    protected boolean isItemValid(TileEntity tileEntity, ItemStack itemStack)
    {
        IInventory inventory = (IInventory)tileEntity;
        Class<?> cls = tileEntity.getClass();

        if(cls == TECellarShelf.class)
            return new SlotFoodOnly(inventory, 0, 0, 0).isItemValid(itemStack);

        return false;
    }
}