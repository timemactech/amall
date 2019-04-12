package com.timemac.amall.order.controller;

import com.timemac.amall.service.api.feign.UserFeignClient;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

    /**
     * 按用户id获取用户
     *
     * @return 用户信息
     */
    @GetMapping("/user/test")
    public UserVO getById() {
        return userFeignClient.getById(111L);
    }
}
