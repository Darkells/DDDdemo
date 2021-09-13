package com.darken.ddddemo.application.query;

import com.darken.ddddemo.application.query.dto.UserDto;

import java.util.List;

/**
 * @author 86134
 */
public interface UserQueryService {

    /**
     * 查询单个用户
     * @param userName 用户名
     * @return 用户Dto
     */
    UserDto queryUser(String userName);

    /**
     * 分页查询用户
     * @param page 第几页
     * @param pageSize 页面大小
     * @return 结果集
     */
    List<UserDto> queryUserPage(Integer page, Integer pageSize);
}
