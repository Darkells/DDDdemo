/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */

package com.darken.ddddemo.domain.even;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 *
 * 异步监听日志事件 看到一个文章说最好使用XA模型进行两阶段提交,(即在发布前先持久化再发布，以及监听到消息后先持久化再进行事件处理)
 * @author Chill
 */
@Slf4j
@AllArgsConstructor
@Component
public class LogEventListener{

	@Async
	@Order
	@EventListener(DomainEventData.class)
	public void eventListener(DomainEventData event) {
		//持久化事件
		//领域事件处理
		if (event.getSource() instanceof String){
			log.info("监听到日志事件 -------------> " + event.toString());
		}
	}
}
