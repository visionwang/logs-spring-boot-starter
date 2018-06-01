package com.hy.logs.properties;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 日志文件的配置文件
 *
 * @author wyx
 */
@ConfigurationProperties(prefix = "log")
@Data
public class LogProperties {
    private String exclude;
    private String[] excludeArr;
}
