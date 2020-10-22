package com.test.trade.service.rpc;

import com.test.trade.service.TradeRpcService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TradeRpcServiceImpl implements TradeRpcService {
    @Override
    public String getTradeById(String orderId) {
        return "tradeRpc返回结果";
    }
}
