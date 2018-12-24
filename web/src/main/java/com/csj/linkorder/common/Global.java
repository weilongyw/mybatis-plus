package com.csj.linkorder.common;

import com.csj.linkorder.config.MybatisPlusConfigProperties;
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
    private MybatisPlusConfigProperties mybatisPlusConfigPropertiesAutowired;

    private static MybatisPlusConfigProperties mybatisPlusConfigProperties;

    @PostConstruct
    public void init() {
        mybatisPlusConfigProperties = this.mybatisPlusConfigPropertiesAutowired;
    }

    public static String getMpDataSourceDriverClassName() {
        return mybatisPlusConfigProperties.getDriverClassName();
    }

    public static String getMpDbUrl() {
        return mybatisPlusConfigProperties.getDbUrl();
    }

    public static String getMpDbUserName() {
        return mybatisPlusConfigProperties.getDbUserName();
    }

    public static String getMpDbPassword() {
        return mybatisPlusConfigProperties.getDbPassword();
    }

    public static String getMpParentPackage() {
        return mybatisPlusConfigProperties.getParentPackage();
    }


}
