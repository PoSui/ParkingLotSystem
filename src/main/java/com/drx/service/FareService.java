package com.drx.service;

import com.drx.dto.*;
import com.drx.po.Fare;
import com.drx.po.Parking;

import java.util.List;

public interface FareService {
    void addFare(int driverId) throws Exception;
    OrderMsg getParkingMsgToOrder(int timeId) throws Exception;
    List<FareMsg> showFares(int driverId) throws Exception;
    void addOrder(Order order) throws Exception;
    AllOrderMsg getOrder(int timeId) throws Exception;
    void pay(int fareId)throws Exception;
    List<ParkingRecord> getParkingRecords(int driverId)throws Exception;
}
