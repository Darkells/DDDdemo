package com.darken.ddddemo.domain.anticorruption;

import com.darken.ddddemo.domain.DO.AccountName;
import com.darken.ddddemo.infrastructure.repository.po.User;

import java.util.List;

/**
 * 用户UserRepository防腐层 只做定义，不做实现 当新旧接口更替时,只需要继承这个接口就行了,上游无需更改
 *
 * @author haoxin
 * @date 2021-02-02
 **/
public interface UserAntiCorruption {

    /**
     * 通过用户ID获取用户
     *
     * @param accountName 用户名
     * @return 用户列表
     */
    List<User> find(AccountName accountName);
}
