package com.darken.ddddemo.domain.repository;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.valueObject.AccountName;
import com.darken.ddddemo.domain.valueObject.UserName;

/**
 * @author 86134
 */
public interface UserRepository {

    /**
     * 查询单个用户
     * @param userName 用户名
     * @return 用户Dto
     */
    User queryUser(UserName userName);

    User queryUser(AccountName accountName);
}
