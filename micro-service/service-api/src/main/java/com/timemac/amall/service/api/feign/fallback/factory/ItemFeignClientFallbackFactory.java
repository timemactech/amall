package com.timemac.amall.service.api.feign.fallback.factory;

import com.timemac.amall.service.api.feign.ItemFeignClient;
import com.timemac.amall.user.api.pojo.bo.UserBO;
import com.timemac.amall.user.api.pojo.query.UserQuery;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

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
            public UserVO getById(Long id) {
                return null;
            }

            @Override
            public List<UserVO> listByQuery(UserQuery query) {
                return null;
            }

            @Override
            public UserVO save(UserBO userBO) {
                return null;
            }

            @Override
            public List<UserVO> batchSave(List<UserBO> userBOList) {
                return null;
            }

            @Override
            public Integer deleteById(Long id) {
                return null;
            }
        };
    }
}
