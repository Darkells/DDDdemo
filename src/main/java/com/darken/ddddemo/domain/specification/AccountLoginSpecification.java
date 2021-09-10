package com.darken.ddddemo.domain.specification;

import com.darken.ddddemo.infrastructure.db.dataObject.AccountLoginDo;

/**
 * @author 86134
 */
public class AccountLoginSpecification {

    private final String password;

    public AccountLoginSpecification(String password) {
        this.password = password;
    }

    public void isSatisfiedBy(AccountLoginDo accountLoginDo) {
        if(accountLoginDo.checkPassword(password)) {
            return;
        }
        throw new IllegalArgumentException("用户或密码不正确");
    }
}
