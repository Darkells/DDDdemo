package com.darken.ddddemo.domain.repository;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountName;
import com.darken.ddddemo.domain.aggregate.User.valueObject.PageInfo;
import com.darken.ddddemo.domain.aggregate.User.valueObject.UserName;

import java.util.List;

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

    /**
     * 通过分页信息查询用户分页
     * @param pageInfo 分页信息
     * @return 分页列表
     */
    List<User> queryUserPage(PageInfo pageInfo);
}
