package com.darken.ddddemo.domain.anticorruption;

import com.darken.ddddemo.domain.DO.AccountName;
import com.darken.ddddemo.infrastructure.repository.po.User;

import java.util.List;

/**
 * 用户-Repository接口
 *
 * @author haoxin
 * @date 2021-02-02
 **/
public interface UserRepository {

    /**
     * 通过用户ID获取用户
     *
     * @param accountName 用户名
     * @return 用户列表
     */
    List<User> find(AccountName accountName);
}
