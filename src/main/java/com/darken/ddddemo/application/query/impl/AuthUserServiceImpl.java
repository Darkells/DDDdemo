package com.darken.ddddemo.application.query.impl;

import com.darken.ddddemo.application.query.AuthUserService;
import com.darken.ddddemo.application.query.dto.AccountLoginDto;
import com.darken.ddddemo.application.query.vo.AccountLoginVo;
import com.darken.ddddemo.application.query.vo.assembler.AccountLoginAssembler;
import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.domain.repository.UserRepository;
import com.darken.ddddemo.domain.specification.AccountLoginSpecification;
import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountLogin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户权限接口实现
 * @author 86134
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public AccountLoginDto loginByAccount(AccountLoginVo accountLoginVo) {
        //值校验
        AccountLogin accountLoginDp = AccountLoginAssembler.toDp(accountLoginVo);

        //查询
        User user = userRepository.queryUser(accountLoginDp.getAccountName());
        if (null == user){
            throw new RuntimeException("用户不存在");
        }

        //规则校验(密码校验)
        AccountLoginSpecification specification = new AccountLoginSpecification(user.getPassword());
        specification.isSatisfiedBy(accountLoginDp);

        //返回userDto
        return new AccountLoginDto("登陆成功",true);
    }
}
