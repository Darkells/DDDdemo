package com.darken.ddddemo.domain.aggregate.User.valueObject;

import lombok.Getter;

/**
 * @author 86134
 */
@Getter
public class PageInfo {

    private Integer page;

    private Integer pageSize;

    public PageInfo(final Integer page,final Integer pageSize){
        this.page = null == page || page < 1 ? 1 : page;
        this.pageSize = null == pageSize ? 10 : pageSize;
    }

    public Integer getCurIndex(){
        return (page - 1) * pageSize;
    }

}
