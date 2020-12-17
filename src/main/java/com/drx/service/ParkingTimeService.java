package com.drx.service;

import com.drx.dto.ParkingMsg;
import com.drx.dto.Time;
import com.drx.po.ParkingTime;

import java.util.List;

public interface ParkingTimeService {
    void addTime(ParkingTime time) throws Exception;
    void addBeginTime(ParkingTime time) throws Exception;
    void addEndTime(ParkingTime time) throws Exception;
    List<Time> showTimes(int driverId)throws Exception;
    List<ParkingMsg> getAllTime(int driverId)throws Exception;

}
