package com.darken.ddddemo.infrastructure.factory;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountName;
import com.darken.ddddemo.domain.aggregate.User.valueObject.UserName;
import com.darken.ddddemo.infrastructure.db.dataObject.LocationDo;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.infrastructure.db.mapper.LocationMapper;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 用户工厂 用来创建聚合对象
 * @author 86134
 */
@Component
public class UserFactory {

    @Resource
    private final UserMapper userMapper;

    @Resource
    private final LocationMapper locationMapper;

    public UserFactory(UserMapper userMapper, LocationMapper locationMapper){
        this.userMapper = userMapper;
        this.locationMapper = locationMapper;
    }

    public User createUserByUserName(UserName name){
        UserDo userDo = userMapper.byUserName(name.getName());
        return createUserByUserDo(userDo);
    }

    public User createUserByAccountName(AccountName accountName) {
        UserDo userDo = userMapper.byUserName(accountName.getName());
        return createUserByUserDo(userDo);
    }

    public User createUserByUserDo(UserDo userDo){
        LocationDo locationDO = locationMapper.byCode(userDo.getLocationCode());
        return createUser(userDo,locationDO);
    }

    private User createUser(UserDo userDo,LocationDo locationDO){
        User user = new User();
        BeanUtils.copyProperties(userDo,user);
        user.setLocationCode(locationDO.getCode());
        return user;
    }
}
