package com.csj.linkorder.common;

import com.csj.linkorder.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Properties;

@Component
public class Global {

    public static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(Global.class.getClassLoader().getResourceAsStream("linkorder.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key, "");
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }


    @Autowired
    private ConfigProperties configPropertiesAutowired;

    private static ConfigProperties configProperties;

    @PostConstruct
    public void init() {
        configProperties = this.configPropertiesAutowired;
    }

    public static String getMpDataSourceDriverClassName() {
        return configProperties.getDriverClassName();
    }

    public static String getMpDbUrl() {
        return configProperties.getDbUrl();
    }

    public static String getMpDbUserName() {
        return configProperties.getDbUserName();
    }

    public static String getMpDbPassword() {
        return configProperties.getDbPassword();
    }

    public static String getMpParentPackage() {
        return configProperties.getParentPackage();
    }


}
