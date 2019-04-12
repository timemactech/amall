package com.timemac.amall.service.api.feign.fallback.factory;

import com.timemac.amall.item.pojo.vo.ItemVO;
import com.timemac.amall.service.api.feign.ItemFeignClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ivanyu
 * @date 2019/1/7 17:55
 * Feign调用失败时需要执行该类中的方法
 */
@Component
public class ItemFeignClientFallbackFactory implements FallbackFactory<ItemFeignClient> {
    @Override
    public ItemFeignClient create(Throwable throwable) {
        return new ItemFeignClient() {

            @Override
            public ItemVO getById(@NotNull(message = "{id.notNull}") Long id) throws Exception {
                return null;
            }

            @Override
            public List<ItemVO> listByOrderId(@NotNull(message = "{id.notNull}") Long orderId) throws Exception {
                return null;
            }
        };
    }
}
