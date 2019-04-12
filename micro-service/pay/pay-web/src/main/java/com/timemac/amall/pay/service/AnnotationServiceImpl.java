package com.timemac.amall.pay.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.timemac.amall.pay.api.AnnotationService;
import org.springframework.stereotype.Component;

@Component
@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
