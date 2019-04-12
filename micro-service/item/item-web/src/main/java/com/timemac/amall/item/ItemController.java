package com.timemac.amall.item;

import com.google.common.collect.Lists;
import com.timemac.amall.item.pojo.vo.ItemVO;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@Validated
@RequestMapping("/item")
public class ItemController implements ItemAPI {
    @Override
    public ItemVO getById(@NotNull(message = "{id.notNull}") Long id) throws Exception {
        return null;
    }

    @Override
    public List<ItemVO> listByOrderId(@NotNull(message = "{id.notNull}") Long orderId) throws Exception {

        List items = Lists.newArrayList();

        for (int i = 0; i < 10; i++) {
            ItemVO it = new ItemVO();
            it.setId(i);
            it.setItemsn("sn" + RandomUtils.nextInt());
            it.setItemName(orderId + "item name " + i);
            items.add(it);
        }

        return items;
    }
}
