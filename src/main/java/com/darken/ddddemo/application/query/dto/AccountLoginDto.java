package com.darken.ddddemo.application.query.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户登陆返回
 * @author 86134
 */
@Data
public class AccountLoginDto implements Serializable {

    public AccountLoginDto(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    @ApiModelProperty(value = "消息")
    private String message;

    @ApiModelProperty(value = "是否成功")
    private boolean success;

}
