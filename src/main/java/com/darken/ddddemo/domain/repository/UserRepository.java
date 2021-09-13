package com.darken.ddddemo.domain.repository;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountName;
import com.darken.ddddemo.domain.aggregate.User.valueObject.UserName;

/**
 * @author 86134
 */
public interface UserRepository {

    /**
     * 通过用户名查询单个用户
     * @param userName 用户名
     * @return 用户Dto
     */
    User queryUser(UserName userName);

    /**
     * 通过账户名查询单个用户
     * @param accountName 用户名
     * @return 用户Dto
     */
    User queryUser(AccountName accountName);
}
