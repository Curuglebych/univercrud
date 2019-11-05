package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {

    private static Properties properties;
    private static String path = "../CrudClient/properties/header.properties";


    public static String getHeaderProperty(String property) {

        properties = new Properties();

        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(property);
    }
}
