package com.darken.ddddemo.application.query.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 86134
 */
@Data
public class AccountLoginVo {


    @ApiModelProperty(value = "账号名")
    private String accountName;


    @ApiModelProperty(value = "密码")
    private String password;

}
