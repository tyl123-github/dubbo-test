package com.test.trade.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface TradeRpcService {

    String getTradeById(@RequestParam("orderIId")String orderId);
}
