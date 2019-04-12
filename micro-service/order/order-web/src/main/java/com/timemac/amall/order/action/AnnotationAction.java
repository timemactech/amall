package com.timemac.amall.order.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.timemac.amall.pay.api.AnnotationService;
import com.timemac.amall.pay.api.PayAPI;
import org.springframework.stereotype.Component;

@Component("annotationAction")
public class AnnotationAction {

    @Reference
    private AnnotationService annotationService;

    @Reference
    private PayAPI payAPI;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}
