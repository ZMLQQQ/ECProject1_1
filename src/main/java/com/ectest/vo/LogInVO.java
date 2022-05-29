package com.ectest.vo;

public class LogInVO {
    private String businessId;
    private String password;

    public String getBusinessId() {
        return businessId;
    }

    public LogInVO() {
    }

    public LogInVO(String businessId, String password) {
        this.businessId = businessId;
        this.password = password;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
