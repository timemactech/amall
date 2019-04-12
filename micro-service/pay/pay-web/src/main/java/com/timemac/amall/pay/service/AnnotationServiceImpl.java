package com.timemac.amall.pay.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.timemac.amall.pay.api.AnnotationService;
import org.springframework.stereotype.Component;

@Component("annotationService")
@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }

    public Float getTotalPayByOrderId(Long orderId) {
        return Float.valueOf(123.12F);
    }
}
