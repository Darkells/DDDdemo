package com.darken.ddddemo.application.query.assembler;

import cn.hutool.core.bean.BeanUtil;
import com.darken.ddddemo.application.query.dto.UserDto;
import com.darken.ddddemo.infrastructure.db.dataObject.LocationDO;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.infrastructure.db.mapper.LocationMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.function.Function;

/**
 * @author: Darken
 * @Date: 2021-09-10 23:32
 */
@Component
public class UserDtoAssembler implements Function<UserDo, UserDto> {

    @Resource
    private LocationMapper locationMapper;

    @Override
    public UserDto apply(UserDo userDo) {
        UserDto userDto = BeanUtil.copyProperties(userDo, UserDto.class);
        LocationDO locationDO = locationMapper.byCode(userDo.getLocationCode());
        userDto.setLocationName(locationDO.getName());
        return userDto;
    }
}
