package com.darken.ddddemo.domain.aggregate.User.valueObject;

import lombok.Data;

/**
 * 账户登陆Dp
 * @author 86134
 */
@Data
public class AccountLogin {

    private AccountName accountName;

    private AccountPassword password;

    public AccountLogin(final AccountName accountName, final AccountPassword password){
        this.accountName = accountName;
        this.password = password;
    }

    /***
     * 检查密码是否相等
     * @param passwordStr 数据库获取的密码
     * @return 是否相等
     */
    public boolean checkPassword(String passwordStr) {
        return password != null && this.password.sameValueAs(passwordStr);
    }
}
