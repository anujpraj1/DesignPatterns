package com.demo.singleinheritence;

import com.demo.singleinheritence.CommonAttributesTable;

public class ItemTable extends CommonAttributesTable {

    private String itemId;

    private String unitOfMeasure;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
