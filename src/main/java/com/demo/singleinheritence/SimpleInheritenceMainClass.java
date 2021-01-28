package com.demo.singleinheritence;

import com.demo.singleinheritence.ItemTable;
import com.demo.singleinheritence.LocationTable;

public class SimpleInheritenceMainClass {

    public static void main(String args[]) {
        LocationTable locationTable = new LocationTable();

        locationTable.setLocationId("CDC.424");
        locationTable.setLocationType("Warehouse");
        locationTable.setCreateTimeOfRecord("31 August 2020 11:00:00");
        locationTable.setModifyTimeOfRecord("31 August 2020 11:00:00");
        locationTable.setCreateUser("Mousumi");
        locationTable.setModifyUser("Mousumi");

        ItemTable itemTable = new ItemTable();
        itemTable.setItemId("00434");
        itemTable.setUnitOfMeasure("EACH");
        itemTable.setCreateTimeOfRecord("30 August 2020 11:00:00");
        itemTable.setModifyTimeOfRecord("30 August 2020 11:00:00");
        itemTable.setCreateUser("THOR");
        itemTable.setModifyUser("THOR");


        System.out.println("=================== Location Information =================");
        System.out.println(locationTable.getLocationId()+" : "+locationTable.getLocationType()+" : "+locationTable.getCreateTimeOfRecord()+" : "+locationTable.getCreateUser());
        System.out.println("=================== Item Information =====================");
        System.out.println(itemTable.getItemId()+" : "+itemTable.getUnitOfMeasure()+" : "+itemTable.getCreateTimeOfRecord()+" : "+itemTable.getCreateUser());
        System.out.println("I printed this line");
        System.out.println("Text Demo");
        System.out.println("Test Demo1");
    }
}
