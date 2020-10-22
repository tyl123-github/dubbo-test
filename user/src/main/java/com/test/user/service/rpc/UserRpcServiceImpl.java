package com.test.user.service.rpc;

import com.test.user.service.UserRpcService;
import com.test.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserRpcServiceImpl implements UserRpcService {

    @Autowired
    private UserService userService;
    @Override
    public String getUserById(Integer userId) {
        return userService.getUserById();
    }
}
