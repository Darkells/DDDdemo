package com.darken.ddddemo.application.query.impl;

import com.darken.ddddemo.application.query.AuthUserService;
import com.darken.ddddemo.application.query.adapter.AccountLoginAdapter;
import com.darken.ddddemo.application.query.dto.AccountLoginDto;
import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.domain.valueObject.AccountLogin;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import com.darken.ddddemo.domain.specification.AccountLoginSpecification;
import com.darken.ddddemo.infrastructure.db.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户权限接口实现
 * @author 86134
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public AccountLoginDto loginByAccount(AccountLoginVo accountLoginVo) {
        //值校验
        AccountLogin accountLoginDp = AccountLoginAdapter.accountLoginVoToDp(accountLoginVo);

        //查询
        UserDo userDo = userMapper.byUserName(accountLoginDp.getAccountName().getName());
        if (null == userDo){
            throw new RuntimeException("用户不存在");
        }

        //规则校验(密码校验)
        AccountLoginSpecification specification = new AccountLoginSpecification(userDo.getPassword());
        specification.isSatisfiedBy(accountLoginDp);

        //返回userDto
        return new AccountLoginDto("登陆成功",true);
    }
}
