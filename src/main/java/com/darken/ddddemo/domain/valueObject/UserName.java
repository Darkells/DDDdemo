package com.darken.ddddemo.domain.valueObject;

import cn.hutool.core.util.StrUtil;

/**
 * @author 86134
 */
public class UserName {

    private final String userName;

    public UserName(String userName){
        if(StrUtil.isBlank(userName)) {
            throw new IllegalArgumentException("用户名不能为空");
        }
        this.userName = userName;
    }

    public String getName() {
        return userName;
    }
}
