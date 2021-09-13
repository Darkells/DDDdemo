package com.darken.ddddemo.infrastructure.repository.impl;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.repository.UserRepository;
import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountName;
import com.darken.ddddemo.domain.aggregate.User.valueObject.UserName;
import com.darken.ddddemo.infrastructure.db.mapper.LocationMapper;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;
import com.darken.ddddemo.infrastructure.factory.UserFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 86134
 */
@Component
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserMapper userMapper;

    @Resource
    private LocationMapper locationMapper;

    @Override
    public User queryUser(UserName name) {
        //先去查询缓存对象 存在直接返回

        //缓存对象不存在 通过工厂查询创建对象
        UserFactory userFactory = new UserFactory(userMapper, locationMapper);
        User user = userFactory.createUserByUserName(name);
        //然后对象缓存

        //返回对象
        return user;
    }

    @Override
    public User queryUser(AccountName accountName) {
        //先去查询缓存对象 存在直接返回

        //缓存对象不存在 通过工厂查询创建对象
        UserFactory userFactory = new UserFactory(userMapper, locationMapper);
        User user = userFactory.createUserByAccountName(accountName);
        //然后对象缓存

        //返回对象
        return user;
    }
}
