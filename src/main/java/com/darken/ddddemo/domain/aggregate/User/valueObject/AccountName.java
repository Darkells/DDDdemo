package com.darken.ddddemo.domain.aggregate.User.valueObject;


import cn.hutool.core.util.StrUtil;

public class AccountName {

    private String name;

    public AccountName(final String accountName){
        if(StrUtil.isBlank(accountName)) {
            throw new IllegalArgumentException("账户名称不能为空");
        }
        this.name = accountName;
    }

    public String getName() {
        return name;
    }
}
