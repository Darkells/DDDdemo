package com.darken.ddddemo.infrastructure.db.dataObject;

import lombok.Data;

/**
 * @author: Darken
 * @Date: 2021-09-10 19:04
 */

@Data
public class UserDo {

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

    /**
     * 邮政编码
     */
    private String locationCode;
}
