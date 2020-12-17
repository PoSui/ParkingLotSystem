package com.drx.controller;

import com.drx.dto.ParkingMsg;
import com.drx.dto.Time;
import com.drx.po.ParkingTime;
import com.drx.service.ParkingTimeService;
import com.google.gson.internal.Streams;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/parkingTimeController")
public class ParkingTimeController {

    private static Logger logger = Logger.getLogger(ParkingTimeController.class);

    @Autowired
    private ParkingTimeService parkingTimeService;

    @RequestMapping("addTime")
    @ResponseBody
    public void addTime(String ids) throws Exception {
    //    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParkingTime time = new ParkingTime();
        Stream.of(ids.split(",")).forEach(s -> {
            Date begin = new Date();
            time.setBeginTime(begin);
            time.setCarId(Integer.parseInt(s));
            try {
                parkingTimeService.addBeginTime(time);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
    @RequestMapping("setEndTime")
    @ResponseBody
    public void setEndTime(String timeId) throws Exception {
        ParkingTime time = new ParkingTime();
        Date end = new Date();
        time.setEndTime(end);
        time.setTimeId(Integer.parseInt(timeId));
        parkingTimeService.addEndTime(time);
    }
    @RequestMapping("showTimes.driverId")
    @ResponseBody
    public List<Time> showTimes(int driverId) throws Exception {
        return parkingTimeService.showTimes(driverId);
    }

    @RequestMapping("getAllTime.driverId")
    @ResponseBody
    public List<ParkingMsg> getAllTime(int driverId) throws Exception {
        return parkingTimeService.getAllTime(driverId);
    }
}
