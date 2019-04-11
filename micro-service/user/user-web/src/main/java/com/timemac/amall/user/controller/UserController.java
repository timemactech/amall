package com.timemac.amall.user.controller;

import com.timemac.amall.user.api.UserAPI;
import com.timemac.amall.user.api.pojo.bo.UserBO;
import com.timemac.amall.user.api.pojo.query.UserQuery;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class UserController implements UserAPI {

    /**
     * 按用户id获取用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public UserVO getById(@NotNull(message = "{id.notNull}") Long id) {
        UserVO userVO = new UserVO();
        userVO.setId(110);
        userVO.setUsername("yuzhili");
        return userVO;
    }

    /**
     * 按条件查询用户列表
     *
     * @param query 查询条件
     * @return 用户列表
     */
    @Override
    public List<UserVO> listByQuery(UserQuery query) {
        return null;
    }

    /**
     * 保存用户
     *
     * @param userBO 用户信息
     * @return 用户信息
     */
    @Override
    public UserVO save(UserBO userBO) {
        return null;
    }

    /**
     * 批量保存用户
     *
     * @param userBOList 用户列表
     * @return 用户列表
     */
    @Override
    public List<UserVO> batchSave(List<UserBO> userBOList) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 删除标示
     */
    @Override
    public Integer deleteById(@NotNull(message = "{id.notNull}") Long id) {
        return null;
    }
}
