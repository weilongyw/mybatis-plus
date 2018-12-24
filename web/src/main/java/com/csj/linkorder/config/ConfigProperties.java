package com.csj.linkorder.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mp")
@Data
public class ConfigProperties {

    private String driverClassName;

    private String dbUrl;

    private String dbUserName;

    private String dbPassword;

    private String parentPackage;

    
}
