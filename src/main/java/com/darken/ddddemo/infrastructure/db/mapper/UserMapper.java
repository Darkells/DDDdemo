package com.darken.ddddemo.infrastructure.db.mapper;

import com.darken.ddddemo.domain.aggregate.User.User;
import com.darken.ddddemo.infrastructure.db.dataObject.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 模拟用户登陆获取用户信息
 * @author 86134
 */
@Mapper
public interface UserMapper {

    /**
     * 依据用户名查询用户数据
     * @param userName   用户名
     * @return  用户数据对象
     */
    UserDo byUserName(@Param(value = "userName") String userName);

    List<UserDo> userPage(@Param(value = "pageIndex")  Integer pageIndex, @Param(value = "pageSize")  Integer pageSize);
}
