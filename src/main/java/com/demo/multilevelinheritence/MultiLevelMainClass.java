package com.demo.multilevelinheritence;

public class MultiLevelMainClass {

    public static void main (String args[]) {
        InventoryTable inventoryTable = new InventoryTable();
        inventoryTable.setSupplyType("ONHAND");
        inventoryTable.setQuantity("20");
        inventoryTable.setItemId("00434");
        inventoryTable.setUnitOfMeasure("EACH");
        inventoryTable.setCreateTimeOfRecord("30 August 2020 11:00:00");
        inventoryTable.setModifyTimeOfRecord("30 August 2020 11:00:00");
        inventoryTable.setCreateUser("THOR");
        inventoryTable.setModifyUser("THOR");


        System.out.println("=================== Item with Inventory Information =====================");
        System.out.println(inventoryTable.getItemId()+" : "+inventoryTable.getUnitOfMeasure()+" : "+inventoryTable.getQuantity()+" : "+inventoryTable.getCreateTimeOfRecord()+" : "+inventoryTable.getCreateUser());

    }
}
