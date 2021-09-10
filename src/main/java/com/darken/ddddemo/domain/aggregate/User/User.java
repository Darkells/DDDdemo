package com.darken.ddddemo.domain.aggregate.User;

import lombok.Data;

/**
 * @author 86134
 */
@Data
public class User {
    /**
     * 用户名
     */
    private String userName;

    /**
     * 帐户
     */
    private String accountId;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;
}
