package com.darken.ddddemo.interfaces.controller.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.darken.ddddemo.application.query.UserQueryService;
import com.darken.ddddemo.application.query.dto.AccountLoginDto;
import com.darken.ddddemo.application.query.AuthUserService;
import com.darken.ddddemo.application.query.dto.UserDto;
import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.application.query.vo.UserPageVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 86134
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private AuthUserService authUserService;

    @Resource
    private UserQueryService userQueryService;

    @PostMapping("/loginByAccount")
    public AccountLoginDto loginByAccount(AccountLoginVo accountLoginCommand) {
        return authUserService.loginByAccount(accountLoginCommand);
    }

    @PostMapping("/queryOne")
    public UserDto findOne(String userName) {
        return userQueryService.queryUser(userName);
    }


}
