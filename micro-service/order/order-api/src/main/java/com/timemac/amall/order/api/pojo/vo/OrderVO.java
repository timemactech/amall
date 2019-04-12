package com.timemac.amall.order.api.pojo.vo;

import com.timemac.amall.item.pojo.vo.ItemVO;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author ivanyu
 * @date 2019/1/28 15:32
 * View Object
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderVO implements Serializable {

    private static final long serialVersionUID = -4537162126504996545L;
    private Integer id;
    private String ordersn;
    private String username;
    private Float totalPay;

    /**
     * 用户信息
     */
    private UserVO userVO;

    /**
     * 商品列表
     */
    private List<ItemVO> items;
}
