package com.drx.dto;

import java.util.Date;

public class AllOrderMsg {
    int orderId;
    int timeId;
    Date beginTime;
    Date endTime;
    int totalTime;
    int money;
    int formulaId;

    public AllOrderMsg() {
    }

    public AllOrderMsg(int orderId, int timeId, Date beginTime, Date endTime, int totalTime, int money, int formulaId) {
        this.orderId = orderId;
        this.timeId = timeId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.totalTime = totalTime;
        this.money = money;
        this.formulaId = formulaId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
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

    public int getFormulaId() {
        return formulaId;
    }

    public void setFormulaId(int formulaId) {
        this.formulaId = formulaId;
    }

    @Override
    public String toString() {
        return "AllOrderMsg{" +
                "orderId=" + orderId +
                ", timeId=" + timeId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", totalTime=" + totalTime +
                ", money=" + money +
                ", formulaId=" + formulaId +
                '}';
    }
}
