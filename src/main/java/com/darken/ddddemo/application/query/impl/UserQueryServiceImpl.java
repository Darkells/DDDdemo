package com.darken.ddddemo.application.query.impl;

import com.darken.ddddemo.application.query.UserQueryService;
import com.darken.ddddemo.application.query.assembler.UserDtoAssembler;
import com.darken.ddddemo.application.query.dto.UserDto;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Darken
 * @Date: 2021-09-10 23:24
 */

@Service
public class UserQueryServiceImpl implements UserQueryService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserDtoAssembler userDtoAssembler;

    @Override
    public UserDto queryUser(String userName) {
        UserDo userDo = userMapper.byUserName(userName);
        return userDtoAssembler.apply(userDo);
    }
}
