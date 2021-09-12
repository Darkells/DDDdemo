package com.darken.ddddemo.application.query;

import com.darken.ddddemo.application.query.dto.UserDto;

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
}
