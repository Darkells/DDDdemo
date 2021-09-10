package com.darken.ddddemo.domain.specification;

import com.darken.ddddemo.domain.DO.AccountLoginDo;

/**
 * @author 86134
 */
public class AccountLoginSpecification {

    private String password;

    public AccountLoginSpecification(String password) {
        this.password = password;
    }

    public boolean isSatisfiedBy(AccountLoginDo accountLoginDo) {
        if(accountLoginDo.checkPassword(password)) {
            return true;
        }
        throw new IllegalArgumentException("用户或密码不正确");

    }
}
