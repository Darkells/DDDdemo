package com.darken.ddddemo.domain.DO;

/**
 * 账户登陆Do
 * @author 86134
 */
public class AccountLoginDo {

    private AccountName accountName;

    private AccountPassword password;

    public AccountLoginDo(final AccountName accountName,final AccountPassword password){
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

    public AccountName getAccountName() {
        return accountName;
    }

    public AccountPassword getPassword() {
        return password;
    }
}
