package com.drx.aliPay;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AlipayConfig {
  /**
   * 服务网关   沙箱环境都是这个
   */								
  public static String serverUrl = "https://openapi.alipaydev.com/gateway.do";
  
  /**
   * 应用id  后期可以替换成自己的id
   */
  public static String appId = "2016102700769422";


  /**
   *  用户私钥   后期替换成自己的私钥  密钥软件中
   */
  public static String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCGboCuNr5lhp+dB/W2Do8FmAsvDaeHT6cc6AGV7hr8XuxzGHQ1oMMA4na0SzwIs5O64EDqMz3Y+lI0TU/TDoSx+yFCjo69EQFXa0qjI8LqV1O/Bv/6laquUQy0OaGytR+tFSC4KEzhfZaD6GzmhrDsnnwjze1FoaeF6H7ZVSmBwF+ovOxjHUeWWrIRV1ByLftqGlMr/5XDMXtN6HkUn4Z60sLAgGDEgDYMLe/3JVM/nrJKYnXi2/6VFlzlrwxnLrYrpCAhj0PjSWrxuALLX01asrvuLRH3v/i26cGBM84cT4WTZZ2jEyXbMOGNP1Kd+YM7sAxwtylrnFbYBMbgKaURAgMBAAECggEAGfIwAe/s9ZlzKxLDON08e37qAa3n/LTB81FQJQjsynLjvh8lJsideok7EfdHYgKO682mmc1EDaHaxd96Hak6sUNgGwF6yUED+kRqBmy7jRFHx6HpPAsxAy3/frV04RIWSAjA5OpaVFcx+smcYy3x7el02lA/kGXv+Gd0PCw0s6cN7G/pExnc31i30TJYzooNB77KlO3lkevu2qzR3eOlQT5z0RQ7VsTpcH1Ph+SyuESfxN8Pj5vtQIpv0+IQVJeCZUrJYv0CrTdHG36sZLdb/0WP+A6scsnmPE7dfwv7IWgWxwHX228i+dL/lTN3t42MizT1X18gqDVvYxcvk/zgxQKBgQDbsMs86XR3ILwI3HUzexYn+5zcB5Xs32p7IYiRNHH9m8wCFC2g7V7dCypidow/GWIpzRx7AiW9H+4oMwsY+gOudV0QXOFDTp06oBt6b2oolTwhSEp7lL9zU1yINMvsWF5xtGeFJ/o/UV8nZVs2X7l93rG8Rpbg/ayOSHPtwbn0rwKBgQCcpl1ySxIysbJZlsuG0PImaiRy4KTJid3a0g5AbRcGt89BuZQh4Hm54PXzrwViVRUL7hZuL0TXLKsKvITmewjtlnqTYqz05f4rXWpDCJljDa8gRZ3YrfWXdTfR+z0dI1e+vrL+Cx3KPtCgRDQ8ude/ugVTAvQ4+v+4Mn8Vz7fyPwKBgQCIxYNyU6F3fQCzv5STzWCY2dPpRCu5wcoICHN+exkwm6sh7DAQDVfO4+GqVUWxDvuHLLQ7fLXEDbn2evjAvv5FwbmDs19myO2oDv+sdOqxg19hFSGR2KRshwyHm98NMGL0BS2hv6bTfrRv0XE849GWpGsg3Q2X2zZvinnqHn7H7wKBgGnuXrbRaUb6v16yCIPsfDPaBzfgDc9z+aDl91k97BpQ5kjN1AxsniRCqk/VhVCPtKHSqTxtnqHbxPaHsV+ix9DSt6U/TzJ07UIp85fNEtzW/hxWt301diSr0cmfmh5ALjABCU2d+tEvVSlrtd9y1SEEDGGsV7bIlXDcRPBc/UlFAoGAP3BRG/f3YAx6bhrASCwZLXD0JE3c8TK/LunCq84QKYt07cNDhP8Hu7j+S/f/NNlTWFbhIJ8Bdu/N1ewVILazwsEn3v+J8FaoKzM36uLe/dXGh4Q2E83irL2JBCxYQ76qDmlmtIWB+yskvSMCIFVrnVZ5Cs9nWzGs8i/bdh/V1H8=";
  
  /**
   *  发送数据的格式 目前只能为json
   */
  public static String format = "json";
  
  /**
   *  设置字符集编码 目前只能为utf-8
   */
  public static String charset = "utf-8";

  /**
   *  支付宝公钥 后期替换成自己的支付宝公钥  沙箱中
   */
  public static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhm6Arja+ZYafnQf1tg6PBZgLLw2nh0+nHOgBle4a/F7scxh0NaDDAOJ2tEs8CLOTuuBA6jM92PpSNE1P0w6EsfshQo6OvREBV2tKoyPC6ldTvwb/+pWqrlEMtDmhsrUfrRUguChM4X2Wg+hs5oaw7J58I83tRaGnheh+2VUpgcBfqLzsYx1HllqyEVdQci37ahpTK/+VwzF7Teh5FJ+GetLCwIBgxIA2DC3v9yVTP56ySmJ14tv+lRZc5a8MZy62K6QgIY9D40lq8bgCy19NWrK77i0R97/4tunBgTPOHE+Fk2WdoxMl2zDhjT9SnfmDO7AMcLcpa5xW2ATG4CmlEQIDAQAB";
  
  /**
   *  支付宝签名 目前是 RSA2
   */
  public static String signType = "RSA2";

  /**
   *  页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
   *  付款结束后跳转的页面
   */
  public static String return_url = "http://localhost:8989/parkingLotSystem/member";
  
  public static AlipayClient getAlipayClient() {
      // 获得初始化的AlipayClient
      AlipayClient alipayClient = new DefaultAlipayClient
    		  (AlipayConfig.serverUrl, AlipayConfig.appId, 
    		AlipayConfig.privateKey, AlipayConfig.format, 
    		AlipayConfig.charset, AlipayConfig.publicKey, AlipayConfig.signType);
      return alipayClient;
  }

}