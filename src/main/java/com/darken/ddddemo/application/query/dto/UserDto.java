package com.darken.ddddemo.application.query.dto;

import lombok.Data;

/**
 * @author: Darken
 * @Date: 2021-09-10 23:25
 */
@Data
public class UserDto {

    private String userName;

    private String password;

    /**
     * 邮政编码
     */
    private String locationCode;

    /**
     * 地址
     */
    private String locationName;
}
