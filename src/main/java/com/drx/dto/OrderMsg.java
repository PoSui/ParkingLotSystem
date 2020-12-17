package com.drx.dto;

import java.util.Date;

public class OrderMsg {
    int timeId;
    Date beginTime;
    Date endTime;
    int totalTime;
    int carId;

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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "OrderMsg{" +
                "timeId=" + timeId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", totalTime=" + totalTime +
                ", carId=" + carId +
                '}';
    }
}
