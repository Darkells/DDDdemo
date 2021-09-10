package com.darken.ddddemo.interfaces.controller.query;

import com.darken.ddddemo.application.dto.AccountLoginDto;
import com.darken.ddddemo.application.service.query.AuthUserService;
import com.darken.ddddemo.application.vo.AccountLoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 86134
 */
@RestController
public class LoginController {

    @Resource
    private AuthUserService authUserService;

    @PostMapping("/loginByAccount")
    public AccountLoginDto loginByAccount(AccountLoginVo accountLoginCommand) {
        return authUserService.loginByAccount(accountLoginCommand);
    }
}
