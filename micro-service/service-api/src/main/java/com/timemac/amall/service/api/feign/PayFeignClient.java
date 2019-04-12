package com.timemac.amall.service.api.feign;

import com.timemac.amall.service.api.feign.fallback.factory.UserFeignClientFallbackFactory;
import com.timemac.amall.user.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "amall-pay", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface PayFeignClient extends UserAPI {
}
