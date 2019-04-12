package com.timemac.amall.pay.api;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author ivanyu
 */
@Component
@Service
public interface AnnotationService {
    String sayHello(String name);
}
