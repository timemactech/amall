package com.timemac.amall.pay.api;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author ivanyu
 */
@Service
public interface AnnotationService {
    String sayHello(String name);

    Float getTotalPayByOrderId(Long orderId);
}
