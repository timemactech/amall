package com.timemac.amall.order.controller;

import com.timemac.amall.order.api.OrderAPI;
import com.timemac.amall.order.api.pojo.vo.OrderVO;
import com.timemac.amall.service.api.feign.ItemFeignClient;
import com.timemac.amall.service.api.feign.UserFeignClient;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
public class OrderController implements OrderAPI {

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private ItemFeignClient itemFeignClient;

    /**
     * 按用户id获取用户
     *
     * @return 用户信息
     */
    @GetMapping("/user/test")
    public UserVO getById() {
        return userFeignClient.getById(111L);
    }


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
    public OrderVO getOrderDetailsById(Long orderId) throws Exception {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(0);
        orderVO.setOrdersn("order sn");
        orderVO.setUsername("user name");
        orderVO.setUserVO(userFeignClient.getById(111L));
        orderVO.setItems(itemFeignClient.listByOrderId(121L));
        return orderVO;
    }
}
