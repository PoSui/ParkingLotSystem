package com.drx.mapper;

import com.drx.dto.OrderMsg;
import com.drx.dto.ParkingMsg;
import com.drx.dto.Time;
import com.drx.po.ParkingTime;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ParkingTimeMapper {
    void insertParkingTime(ParkingTime time) throws Exception;
    void insertBeginTime(ParkingTime time) throws Exception;
    void UpdateEndTime(ParkingTime time) throws Exception;
    OrderMsg findOneTimes(int timeId)throws Exception;
    List<ParkingMsg> findAllTimes(int driverId)throws Exception;
    List<ParkingTime> findTimesByCarIds(List<Integer> carIds)throws Exception;
    List<Time> findTimesByCarId(int carId)throws Exception;
    List<Time> findTimesByCarIdAndFormulaId(Map<String,Object> map)throws Exception;
}
