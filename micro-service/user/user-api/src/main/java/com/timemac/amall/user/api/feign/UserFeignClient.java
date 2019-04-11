package com.timemac.amall.user.api.feign;

import com.timemac.amall.user.api.UserAPI;
import com.timemac.amall.user.api.feign.fallback.factory.UserFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "amall-user", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface UserFeignClient extends UserAPI {
}
