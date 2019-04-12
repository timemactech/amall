package com.timemac.amall.order.api;

import com.timemac.amall.order.api.pojo.vo.OrderVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ivanyu
 * @date 2019/2/1 23:57
 * 订单接口
 * 1、其中字符串变量可供其他微服务调用时是用，避免直接输入接口地址
 * 2、类级注解@Validated适用于形参为基础数据包装类型时，例如Integer、Long、String等
 * 3、方法级别注解@Validated适用于形参为POJO时
 * 4、校验提示消息详见ValidationMessages.properties文件
 */
@Validated
public interface OrderAPI {

    String GET_BY_USER_ID = "/get_by_user_id";

    String GET_BY_ORDER_ID = "/{order_id}";

    @GetMapping(value = GET_BY_USER_ID)
    List<OrderVO> getByUserId(@RequestParam(value = "user_id", required = false) @NotNull(message = "{order.userId.notBlank}") Long userId) throws Exception;


    /**
     * 按订单id获取订单详情
     *
     * @param orderId 订单id
     * @return 订单详情
     * @throws Exception 查询异常
     */
    @GetMapping(value = GET_BY_ORDER_ID)
    OrderVO getOrderDetailsById(@PathVariable(value = "order_id") String orderId) throws Exception;
}
