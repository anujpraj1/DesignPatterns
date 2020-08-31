package com.demo.singleinheritence;

public class CommonAttributesTable {

    private String createTimeOfRecord;

    private String modifyTimeOfRecord;

    private String createUser;

    private String modifyUser;

    public String getCreateTimeOfRecord() {
        return createTimeOfRecord;
    }

    public void setCreateTimeOfRecord(String createTimeOfRecord) {
        this.createTimeOfRecord = createTimeOfRecord;
    }

    public String getModifyTimeOfRecord() {
        return modifyTimeOfRecord;
    }

    public void setModifyTimeOfRecord(String modifyTimeOfRecord) {
        this.modifyTimeOfRecord = modifyTimeOfRecord;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
}
