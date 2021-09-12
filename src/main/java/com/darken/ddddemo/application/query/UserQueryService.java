package com.darken.ddddemo.application.query;

import com.darken.ddddemo.application.query.dto.UserDto;


public interface UserQueryService {

    UserDto queryUser(String userName);
}
