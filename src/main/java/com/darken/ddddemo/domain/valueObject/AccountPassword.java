package com.darken.ddddemo.domain.valueObject;

import cn.hutool.core.util.StrUtil;

/**
 * @author 86134
 */
public class AccountPassword {

    private final String password;

    public AccountPassword(String password){
        if(StrUtil.isBlank(password)) {
            throw new IllegalArgumentException("密码不能为空");
        }
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean sameValueAs(String passwordStr) {
        return password.equals(passwordStr);
    }
}
