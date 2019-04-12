package com.timemac.amall.service.api.feign.fallback.factory;

import com.timemac.amall.order.api.pojo.vo.OrderVO;
import com.timemac.amall.service.api.feign.OrderFeignClient;
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
public class OrderFeignClientFallbackFactory implements FallbackFactory<OrderFeignClient> {
    @Override
    public OrderFeignClient create(Throwable throwable) {
        return new OrderFeignClient() {

            @Override
            public List<OrderVO> getByUserId(@NotNull(message = "{order.userId.notBlank}") Long userId) throws Exception {
                return null;
            }

            /**
             * 按订单id获取订单详情
             *
             * @param orderId 订单id
             * @return 订单详情
             * @throws Exception 查询异常
             */
            @Override
            public OrderVO getOrderDetailsById(String orderId) throws Exception {
                return null;
            }
        };
    }
}
