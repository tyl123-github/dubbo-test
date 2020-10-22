package com.test.user.service.impl;

import com.test.trade.service.TradeRpcService;
import com.test.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Reference
    private TradeRpcService rpcService;
    @Override
    public String getUserById() {
        return "返回用户信息";
    }

    @Override
    public String getTrade() {
        String tradeById = rpcService.getTradeById("1");
        return tradeById;
    }
}
