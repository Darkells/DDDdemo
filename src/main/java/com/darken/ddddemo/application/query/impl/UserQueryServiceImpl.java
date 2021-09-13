package com.darken.ddddemo.application.query.impl;

import com.darken.ddddemo.application.query.UserQueryService;
import com.darken.ddddemo.application.query.dto.assembler.UserDtoAssembler;
import com.darken.ddddemo.application.query.dto.UserDto;
import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.aggregate.User.valueObject.UserName;
import com.darken.ddddemo.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Darken
 * @Date: 2021-09-10 23:24
 */

@Service
public class UserQueryServiceImpl implements UserQueryService {

    @Resource
    UserRepository userRepository;

    @Override
    public UserDto queryUser(String userName) {
        //值校验
        UserName name = new UserName(userName);
        //仓储获取聚合
        User user = userRepository.queryUser(name);
        //规则校验

        //转换
        return UserDtoAssembler.apply(user);
    }
}
