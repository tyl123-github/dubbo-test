package com.test.trade.service.impl;

import com.test.trade.service.TradeService;
import com.test.user.service.UserRpcService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TradeServiceImpl implements TradeService {

    @Reference
    private UserRpcService userRpcService;
    @Override
    public String getTradeById(String orderId) {

        return "getUserById返回信息";
    }

    @Override
    public String getUser() {
        String userById = userRpcService.getUserById(1);
        log.info("调用userRpc返回结果={}",userById);
        return userById;
    }
}
