package com.drx.dto;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Alias("time")
public class ParkingMsg {
    private  String licenseNum;
    private String brand;
    private  String color;
    private int formulaId;
    private  Date beginTime;
    private int timeId;

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(int formulaId) {
        this.formulaId = formulaId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    @Override
    public String toString() {
        return "ParkingMsg{" +
                "licenseNum='" + licenseNum + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", formulaId=" + formulaId +
                ", beginTime=" + beginTime +
                ", timeId=" + timeId +
                '}';
    }
}
