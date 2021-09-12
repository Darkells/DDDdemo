package com.darken.ddddemo.infrastructure.repository.impl;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.valueObject.UserName;
import com.darken.ddddemo.domain.repository.UserRepository;
import com.darken.ddddemo.infrastructure.db.dataObject.LocationDO;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.infrastructure.db.mapper.LocationMapper;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;
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
        UserDo userDo = userMapper.byUserName(name.getName());
        LocationDO locationDO = locationMapper.byCode(userDo.getLocationCode());
        return new User(userDo,locationDO);
    }
}
