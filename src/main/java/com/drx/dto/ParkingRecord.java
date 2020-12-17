package com.drx.dto;

import java.util.Date;

public class ParkingRecord {
        int orderId;
        String licenseNum;
        Date beginTime;
        Date endTime;
        int totalTime;
        int money;

    public ParkingRecord(int orderId, String licenseNum, Date beginTime, Date endTime, int totalTime, int money) {
        this.orderId = orderId;
        this.licenseNum = licenseNum;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.totalTime = totalTime;
        this.money = money;
    }

    public ParkingRecord() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ParkingRecord{" +
                "orderId=" + orderId +
                ", licenseNum='" + licenseNum + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", totalTime=" + totalTime +
                ", money=" + money +
                '}';
    }
}
