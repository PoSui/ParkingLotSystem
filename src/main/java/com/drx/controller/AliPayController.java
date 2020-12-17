package com.drx.controller;


import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.drx.aliPay.AlipayConfig;
import com.drx.controller.FareController;
import com.drx.dto.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/alipay")
public class AliPayController {

    @ResponseBody
    @RequestMapping("/orderPay")
    public String orderPay(HttpServletResponse response,HttpServletRequest request) throws Exception {

        //调用service去数据库中查询当前订单

        //支付

        //浏览器动态产生一个付钱的二维码
        /**
         * 需要将我们的项目接入支付宝
         * 入驻蚂蚁金服平台
         */
        String result="";
        String orderId = request.getParameter("orderId");
        String money = request.getParameter("money");
        try {
            AlipayClient alipayClient = AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();

            AlipayTradePayModel model = new AlipayTradePayModel();
            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo(orderId);
            // 设置订单金额
            model.setTotalAmount(money);
            // 订单名字
            model.setSubject("支付订单");
            // 订单描述
            model.setBody("停车管理系统");
            // 产品码
            model.setProductCode("FAST_INSTANT_TRADE_PAY");
            // 设置参数
            alipayRequest.setBizModel(model);
            // 设置回调地址
            alipayRequest.setReturnUrl(AlipayConfig.return_url);
            result = alipayClient.pageExecute(alipayRequest).getBody();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(result);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("/tokenOrderPay")
    public String tokenOrderPay(HttpServletResponse response,HttpServletRequest request) throws Exception {

        //调用service去数据库中查询当前订单

        //支付

        //浏览器动态产生一个付钱的二维码
        /**
         * 需要将我们的项目接入支付宝
         * 入驻蚂蚁金服平台
         */
        String result="";
        String orderId = request.getParameter("orderId");
        String money = request.getParameter("money");
        try {
            AlipayClient alipayClient = AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();

            AlipayTradePayModel model = new AlipayTradePayModel();
            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo(orderId);
            // 设置订单金额
            model.setTotalAmount(money);
            // 订单名字
            model.setSubject("支付订单");
            // 订单描述
            model.setBody("卡券交易支付");
            // 产品码
            model.setProductCode("FAST_INSTANT_TRADE_PAY");
            // 设置参数
            alipayRequest.setBizModel(model);
            // 设置回调地址
            alipayRequest.setReturnUrl(AlipayConfig.return_url);
            result = alipayClient.pageExecute(alipayRequest).getBody();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(result);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
