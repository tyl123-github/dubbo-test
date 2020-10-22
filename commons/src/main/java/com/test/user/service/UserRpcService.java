package com.test.user.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface UserRpcService {

    String getUserById(@RequestParam("userId")Integer userId);
}
