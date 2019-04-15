package com.timemac.amall.pay.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.timemac.amall.pay.api.PayAPI;

@Service
public class PayServiceImpl implements PayAPI {
    @Override
    public String hello(String message) {
        return "annotation: hello, " + message;
    }

    @Override
    public Float getTotalPayByOrderId(Long orderId) {
        return Float.valueOf(123.13F);
    }
}
