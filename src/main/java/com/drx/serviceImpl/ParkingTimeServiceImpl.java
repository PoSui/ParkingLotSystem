package com.drx.serviceImpl;

import com.drx.dto.ParkingMsg;
import com.drx.dto.Time;
import com.drx.mapper.CarMapper;
import com.drx.mapper.ParkingTimeMapper;
import com.drx.po.ParkingTime;
import com.drx.service.ParkingTimeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ParkingTimeServiceImpl implements ParkingTimeService {

    private static Logger logger = Logger.getLogger(ParkingTimeServiceImpl.class);

    @Autowired
    private ParkingTimeMapper parkingTimeMapper;

    @Autowired
    private CarMapper carMapper;

    @Transactional
    public void addTime(ParkingTime time) throws Exception {
        Date beginTime = time.getBeginTime();
        Date endTime = time.getEndTime();
        int total = getTotalTime(beginTime,endTime);
        time.setTotalTime(total);

        parkingTimeMapper.insertParkingTime(time);
    }

    @Transactional
    public void addBeginTime(ParkingTime time) throws Exception {
        parkingTimeMapper.insertParkingTime(time);
    }

    @Override
    public void addEndTime(ParkingTime time) throws Exception {
        parkingTimeMapper.UpdateEndTime(time);

    }


    private static int getTotalTime(Date beginTime,Date endTime){

        long l = endTime.getTime() - beginTime.getTime();
        int totalTime = (int) (l/3600000);
        return totalTime;
    }

    @Transactional
    public List<Time> showTimes(int driverId) throws Exception {
        List<Time> times = new ArrayList<>();

        List<Integer> carIds = carMapper.findCarIdsByDriverId(driverId);

        for (int carId: carIds) {
            List<Time> list = parkingTimeMapper.findTimesByCarId(carId);
            times.addAll(list);
        }
        logger.info("查询得到的停车记录："+times);
        return times;
    }
    @Transactional
    public List<ParkingMsg> getAllTime(int driverId) {

        List<ParkingMsg> parkingMsgs = new ArrayList<>();
        try {
            parkingMsgs = parkingTimeMapper.findAllTimes(driverId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parkingMsgs;
    }
}
