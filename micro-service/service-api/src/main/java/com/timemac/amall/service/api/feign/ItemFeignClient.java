package com.timemac.amall.service.api.feign;

import com.timemac.amall.item.ItemAPI;
import com.timemac.amall.service.api.feign.fallback.factory.ItemFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "amall-item", fallbackFactory = ItemFeignClientFallbackFactory.class)
public interface ItemFeignClient extends ItemAPI {
}
