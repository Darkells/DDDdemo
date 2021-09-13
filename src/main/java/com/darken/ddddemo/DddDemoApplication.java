package com.darken.ddddemo;

import com.darken.ddddemo.domain.even.DomainEventData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DddDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DddDemoApplication.class, args);


        DomainEventData eventData = new DomainEventData("123456",1);
        //发布事件
        context.publishEvent(eventData);

        eventData = new DomainEventData(Integer.valueOf(555),2);
        context.publishEvent(eventData);
        //关闭监视器
        context.close();

    }
}
