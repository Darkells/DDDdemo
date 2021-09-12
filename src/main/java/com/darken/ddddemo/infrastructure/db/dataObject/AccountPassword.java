package com.darken.ddddemo.infrastructure.db.dataObject;

import cn.hutool.core.util.StrUtil;

/**
 * @author 86134
 */
public class AccountPassword {

    private String password;

    public AccountPassword(final String password){
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
