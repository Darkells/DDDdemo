package com.darken.ddddemo.infrastructure.repository.mapper;

import com.darken.ddddemo.domain.DO.AccountName;
import com.darken.ddddemo.domain.anticorruption.UserRepository;
import com.darken.ddddemo.infrastructure.repository.po.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟用户登陆获取用户信息
 * @author 86134
 */
@Component
public class UserMapper implements UserRepository {
    @Override
    public List<User> find(AccountName accountName) {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUserName("张三");
        user.setAccountId("156874");
        user.setUserType("普通用户");
        user.setPassword("7758258");
        user.setStatus("搏起");
        user.setRemarks("qaq");
        user.setMobile("18877845698");
        user.setEmail("zhangSan@.qq.com");
        userList.add(user);
        return userList;
    }
}
