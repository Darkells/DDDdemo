package com.darken.ddddemo.interfaces.filter;

import cn.hutool.extra.servlet.ServletUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 86134
 */
@Slf4j
public class IpInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull Object handler) {
        //过滤ip,若用户在白名单内，则放行
        String ipAddress = ServletUtil.getClientIP(request);
        log.info("ip地址打印==========> " + ipAddress);
        return true;
    }
}