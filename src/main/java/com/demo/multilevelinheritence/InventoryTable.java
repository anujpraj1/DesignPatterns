package com.demo.multilevelinheritence;

import com.demo.singleinheritence.ItemTable;

public class InventoryTable extends ItemTable {

    private String supplyType;

    private String quantity;

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
