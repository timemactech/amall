package com.timemac.amall.service.api.feign;

import com.timemac.amall.service.api.feign.fallback.factory.UserFeignClientFallbackFactory;
import com.timemac.amall.user.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "amall-order", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface OrderFeignClient extends UserAPI {
}
