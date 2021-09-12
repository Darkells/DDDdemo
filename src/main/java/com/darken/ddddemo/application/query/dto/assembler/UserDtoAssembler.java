package com.darken.ddddemo.application.query.dto.assembler;

import cn.hutool.core.bean.BeanUtil;
import com.darken.ddddemo.application.query.dto.UserDto;
import com.darken.ddddemo.domain.aggregate.User.User;

/**
 * @author: Darken
 * @Date: 2021-09-10 23:32
 */
public class UserDtoAssembler{

    public static UserDto apply(User user) {
        UserDto userDto = BeanUtil.copyProperties(user.getUser(), UserDto.class);
        userDto.setLocationName(user.getLocation().getName());
        return userDto;
    }
}
