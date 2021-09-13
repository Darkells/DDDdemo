package com.darken.ddddemo.domain.even;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import java.util.Date;

/**
 * 事件发布实体
 * @author 86134
 */
@Getter
@Setter
public class DomainEventData extends ApplicationEvent {

    /**
     * 事件唯一标识
     */
    private Long id;

    /**
     * 事件发生时间
     */
    private Date time;

    /**
     * 事件类型
     */
    private Integer type;

    public DomainEventData(Object source,Integer type) {
        super(source);
        this.type = type;
        this.id = System.currentTimeMillis();
        this.time = new Date(id);
    }

    @Override
    public String toString() {
        return "DomainEventData{" +
                "id=" + id +
                ", time=" + time +
                ", type=" + type +
                ", source=" + source +
                '}';
    }
}
