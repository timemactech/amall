package com.timemac.amall.order.api.pojo.query;

import com.timemac.amall.order.api.pojo.query.basic.BasicQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ivanyu
 * @date 2019/1/30 11:52
 * Query Object
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class OrderQuery extends BasicQuery implements Serializable {

    private static final long serialVersionUID = 4408955581111661327L;
    private String ordersn;
    private Long userId;
}
