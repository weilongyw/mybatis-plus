package com.csj.linkorder.common;

import java.io.IOException;
import java.util.Properties;

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

    public static String getGeneratorPath() {
        return properties.get("generator.path") == null ? "" : properties.get("generator.path").toString();
    }
    public static String getDbUrl() {
        return properties.get("generator.path") == null ? "" : properties.get("generator.path").toString();
    }
    public static String getDbUserName() {
        return properties.get("generator.path") == null ? "" : properties.get("generator.path").toString();
    }
    public static String getDbPassword() {
        return properties.get("generator.path") == null ? "" : properties.get("generator.path").toString();
    }

}
