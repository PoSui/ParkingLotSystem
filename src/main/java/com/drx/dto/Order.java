package com.drx.dto;

import java.util.Date;

public class Order {

    int timeId;
    Date beginTime;
    Date endTime;
    int totalTime;
    int money;

    public Order( int timeId, Date beginTime, Date endTime, int totalTime, int money) {
        this.timeId = timeId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.totalTime = totalTime;
        this.money = money;
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

    @Override
    public String toString() {
        return "Order{" +
                "timeId=" + timeId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", totalTime=" + totalTime +
                ", money=" + money +
                '}';
    }
}
