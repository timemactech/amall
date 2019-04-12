package com.timemac.amall.item.pojo.query;

import com.timemac.amall.item.pojo.query.basic.BasicQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author NickZxing
 * @date 2019/1/30 11:52
 * Query Object
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ItemQuery extends BasicQuery implements Serializable {

    private static final long serialVersionUID = -8384377165478266940L;
    private String itemsn;
    private String itemName;
}
