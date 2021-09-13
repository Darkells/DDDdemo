package com.darken.ddddemo.domain.specification;

import com.darken.ddddemo.domain.aggregate.User.valueObject.AccountLogin;

/**
 * @author 86134
 */
public class AccountLoginSpecification {

    private final String password;

    public AccountLoginSpecification(String password) {
        this.password = password;
    }

    public void isSatisfiedBy(AccountLogin accountLogin) {
        if(accountLogin.checkPassword(password)) {
            return;
        }
        throw new IllegalArgumentException("用户或密码不正确");
    }
}
