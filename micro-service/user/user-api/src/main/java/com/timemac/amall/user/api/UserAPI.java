package com.timemac.amall.user.api;

import com.timemac.amall.user.api.pojo.bo.UserBO;
import com.timemac.amall.user.api.pojo.query.UserQuery;
import com.timemac.amall.user.api.pojo.vo.UserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ivanyu
 * @date 2019/2/1 23:57
 * 用户接口
 * 1、其中字符串变量可供其他微服务调用时是用，避免直接输入接口地址
 * 2、类级注解@Validated适用于形参为基础数据包装类型时，例如Integer、Long、String等
 * 3、方法级别注解@Validated适用于形参为POJO时
 * 4、校验提示消息详见ValidationMessages.properties文件
 */
@Validated
public interface UserAPI {

    String GET_BY_ID = "/get_by_id";
    String LIST_BY_QUERY = "/list_by_query";
    String SAVE = "/save";
    String BATCH_SAVE = "/batch_save";
    String DELETE_BY_ID = "/delete_by_id";

    /**
     * 按用户id获取用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping(value = GET_BY_ID)
    UserVO getById(@RequestParam(value = "id", required = false) @NotNull(message = "{id.notNull}") Long id);

    /**
     * 按条件查询用户列表
     *
     * @param query 查询条件
     * @return 用户列表
     */
    @PostMapping(value = LIST_BY_QUERY)
    List<UserVO> listByQuery(@RequestBody UserQuery query);

    /**
     * 保存用户
     *
     * @param userBO 用户信息
     * @return 用户信息
     */
    @PostMapping(value = SAVE)
    UserVO save(@RequestBody @Validated UserBO userBO);

    /**
     * 批量保存用户
     *
     * @param userBOList 用户列表
     * @return 用户列表
     */
    @PostMapping(value = BATCH_SAVE)
    List<UserVO> batchSave(@RequestBody @Validated List<UserBO> userBOList);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 删除标示
     */
    @GetMapping(value = DELETE_BY_ID)
    Integer deleteById(@RequestParam(value = "id", required = false) @NotNull(message = "{id.notNull}") Long id);
}
