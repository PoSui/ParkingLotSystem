package com.drx.aliPay;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.drx.controller.FareController;
import com.drx.dto.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        //拿到订单id

		//调用service去数据库中查询当前订单

		//支付
	     
	    //浏览器动态产生一个付钱的二维码
	     /**
	      * 需要将我们的项目接入支付宝
	      * 入驻蚂蚁金服平台
	      */
	     
	     try {
	          AlipayClient alipayClient = AlipayConfig.getAlipayClient();
	          //设置请求参数
	          AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	          
	          AlipayTradePayModel model = new AlipayTradePayModel();
	          // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
	          model.setOutTradeNo("123");
	          // 设置订单金额
	          model.setTotalAmount("321");
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
	          String result = alipayClient.pageExecute(alipayRequest).getBody();
	          response.setContentType("text/html;charset=utf-8");
	          response.getWriter().println(result);
	      } catch (Exception e) {
	              e.printStackTrace();
	      }
	     
	}
}

