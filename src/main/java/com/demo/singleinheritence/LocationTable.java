package com.demo.singleinheritence;

import com.demo.singleinheritence.CommonAttributesTable;

public class LocationTable extends CommonAttributesTable {

    private String locationId;

    private String locationType;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
