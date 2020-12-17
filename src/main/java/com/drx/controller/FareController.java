package com.drx.controller;

import com.drx.aliPay.PayServlet;
import com.drx.dto.*;
import com.drx.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("fareController")
public class FareController {

    @Autowired
    private FareService fareService;

    @RequestMapping("addFares.driverId")
    @ResponseBody
    public void addFares(int driverId)throws Exception{
        fareService.addFare(driverId);
    }

    @RequestMapping("showFares")
    @ResponseBody
    public List<FareMsg> showFares(int driverId) throws Exception{
        return fareService.showFares(driverId);
    }

    @RequestMapping("pay")
    @ResponseBody
    public void pay(int fareId) throws Exception{
        fareService.pay(fareId);
    }
    @RequestMapping("getParkingMsgToOrder")
    @ResponseBody
    public AllOrderMsg getParkingMsgToOrder(String timeId)throws Exception{

        OrderMsg om =  fareService.getParkingMsgToOrder(Integer.parseInt(timeId));
        if(om.getEndTime()==null){
            System.out.println("null了");
        }else if(om.getBeginTime()==null){
            System.out.println("了null");
        }
        long total = om.getEndTime().getTime() - om.getBeginTime().getTime();
        double hour = Math.ceil(total / (1000 * 60 * 60)) + 1.0;
        double money = hour * 5;
        Order ord = new Order(om.getTimeId(), om.getBeginTime(), om.getEndTime(), (int)hour, (int) money);
        fareService.addOrder(ord);
        return fareService.getOrder(om.getTimeId());

    }
    @RequestMapping("getParkingRecords")
    @ResponseBody
    public List<ParkingRecord> getParkingRecords(String driverId)throws Exception{

        return fareService.getParkingRecords(Integer.parseInt(driverId));
    }
}
