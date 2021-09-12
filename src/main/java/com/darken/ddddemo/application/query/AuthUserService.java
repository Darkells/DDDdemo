package com.darken.ddddemo.application.query;

import com.darken.ddddemo.application.query.dto.AccountLoginDto;
import com.darken.ddddemo.application.query.vo.AccountLoginVo;

/**
 * 用户权限接口
 * @author 86134
 */
public interface AuthUserService {

    /**
     * 用户登陆
     * @param accountLoginVo 用户登陆Vo
     * @return 用户登陆Dto
     */
    AccountLoginDto loginByAccount(AccountLoginVo accountLoginVo);
}
