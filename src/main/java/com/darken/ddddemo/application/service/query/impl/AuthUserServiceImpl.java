package com.darken.ddddemo.application.service.query.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.darken.ddddemo.application.adapter.AccountLoginAdapter;
import com.darken.ddddemo.application.dto.AccountLoginDto;
import com.darken.ddddemo.application.service.query.AuthUserService;
import com.darken.ddddemo.application.vo.AccountLoginVo;
import com.darken.ddddemo.domain.DO.AccountLoginDo;
import com.darken.ddddemo.domain.anticorruption.UserRepository;
import com.darken.ddddemo.domain.specification.AccountLoginSpecification;
import com.darken.ddddemo.infrastructure.repository.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        AccountLoginDo accountLoginDo = AccountLoginAdapter.accountLoginVoToDo(accountLoginVo);
        //todo 不对劲  直接查询获取得到po没有转DO
        List<User> userList = userRepository.find(accountLoginDo.getAccountName());
        if (CollectionUtil.isEmpty(userList)){
            throw new RuntimeException("用户或密码不正确");
        }
        User user = userList.get(0);
        AccountLoginSpecification specification = new AccountLoginSpecification(user.getPassword());
        specification.isSatisfiedBy(accountLoginDo);
        return new AccountLoginDto("登陆成功",true);
    }
}
