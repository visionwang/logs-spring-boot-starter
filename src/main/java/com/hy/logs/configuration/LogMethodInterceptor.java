package com.hy.logs.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author wyx
 */
@Slf4j
@Component
public class LogMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String name = invocation.getMethod().getName();
        long begin = System.currentTimeMillis();
        invocation.proceed();
        long end = System.currentTimeMillis();
        System.out.println("执行方法" + name + "用时" + (end - begin)+"s");
        return null;
    }
}
