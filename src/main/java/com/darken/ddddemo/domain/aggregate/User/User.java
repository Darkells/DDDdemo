package com.darken.ddddemo.domain.aggregate.User;

import com.darken.ddddemo.infrastructure.db.dataObject.LocationDO;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;

/**
 * @author 86134
 */
public class User {

    /**
     * 用户对象
     */
    private final UserDo user;

    /**
     * 地址
     */
    private final LocationDO location;

    public User(UserDo userDo,LocationDO locationDO){
        this.user = userDo;
        this.location = locationDO;
    }

    public UserDo getUser() {
        return user;
    }

    public LocationDO getLocation() {
        return location;
    }
}
