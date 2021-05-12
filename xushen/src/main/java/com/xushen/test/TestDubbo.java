//package com.xushen.test;
//
//import com.alibaba.fastjson.JSON;
//import com.shenma.customer.account.dto.DepositaccbscRes;
//import com.shenma.customer.account.dto.dpm.DpmChargePayReq;
//import com.shenma.customer.account.service.DepositService;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * @author maorui.wang
// * @create 2018-07-05 15:49
// * @desc
// **/
//public class TestDubbo {
//
//    public static void handleSendMessage() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/spring/dubbo-consumer.xml" });
//        context.start();
//        DepositService sendService = (DepositService) context.getBean("depositService");  //这里对应配置文件中声明的beanId
//        DpmChargePayReq req=new DpmChargePayReq();
//        req.setOperatorId("ddd");
//        req.setSerialNo("ssss");
//        req.setAmt("10000");
//        req.setId("201806030750395");
//        req.setSerialNo("5464a6sdfasdf");
//        req.setTransNo("asdfasdf");
//        req.setApplNo("20180621181673");
//        DepositaccbscRes res=sendService.dpmChargePay(req);
//        System.out.println("################################### queryDpmAccbsc resp:"+ JSON.toJSONString(res));
//
//    }
//
//    public static void main(String[] args) {
//        TestDubbo.handleSendMessage();
//    }
//}
