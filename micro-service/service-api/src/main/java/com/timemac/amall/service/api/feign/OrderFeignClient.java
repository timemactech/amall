package com.timemac.amall.service.api.feign;

import com.timemac.amall.order.api.OrderAPI;
import com.timemac.amall.service.api.feign.fallback.factory.OrderFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "amall-order", fallbackFactory = OrderFeignClientFallbackFactory.class)
public interface OrderFeignClient extends OrderAPI {
}
