package com.springboot.hbase.config.hbase;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @author Tony.niu (hystrix0779@yeah.net)
 * @version V1.0
 * @date 2020/7/28
 **/
@Data
@ConfigurationProperties(prefix = "hbase")
public class HBaseProperties {
    private Map<String, String> config;
}
