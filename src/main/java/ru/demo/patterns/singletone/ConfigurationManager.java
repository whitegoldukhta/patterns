package ru.demo.patterns.singletone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();
        // загрузка конфигураций из файла
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
