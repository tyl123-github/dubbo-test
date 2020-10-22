package com.test.trade.controller;

import com.test.trade.service.TradeRpcService;
import com.test.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @RequestMapping("getTradeById")
    public String getTradeById(@RequestParam(required = false)String orderId){
        return tradeService.getTradeById(orderId);
    }
    @RequestMapping("getUser")
    public String getUser(){
        return tradeService.getUser();
    }
}
