package com.darken.ddddemo.infrastructure.db.mapper;


import com.darken.ddddemo.infrastructure.db.dataObject.LocationDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author 黑の鱼
 */
@Mapper
public interface LocationMapper {

    /**
     * 依据邮编码查询
     * @param code 512300
     * @return 地址数据对象
     */
    LocationDo byCode(@Param("code") String code);

}
