package com.darken.ddddemo.infrastructure.factory;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.valueObject.AccountName;
import com.darken.ddddemo.domain.valueObject.UserName;
import com.darken.ddddemo.infrastructure.db.dataObject.LocationDO;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.infrastructure.db.mapper.LocationMapper;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;

/**
 * @author 86134
 */
public class UserFactory {

    private final UserMapper userMapper;

    private final LocationMapper locationMapper;

    public UserFactory(UserMapper userMapper, LocationMapper locationMapper){
        this.userMapper = userMapper;
        this.locationMapper = locationMapper;
    }

    public User createUserByUserName(UserName name){
        UserDo userDo = userMapper.byUserName(name.getName());
        LocationDO locationDO = locationMapper.byCode(userDo.getLocationCode());
        return new User(userDo,locationDO);
    }

    public User createUserByAccountName(AccountName accountName) {
        UserDo userDo = userMapper.byUserName(accountName.getName());
        LocationDO locationDO = locationMapper.byCode(userDo.getLocationCode());
        return new User(userDo,locationDO);
    }
}
