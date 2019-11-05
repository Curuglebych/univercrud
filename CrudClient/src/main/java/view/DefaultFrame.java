package view;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DefaultFrame extends JFrame {

    private DefaultFrame() {
        init();
    }

    private void init() {

        setTitle(getHeader());

        setResizable(false);

        setSize(new Dimension(1024,768));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static DefaultFrame getInstanse() {
        return new DefaultFrame();
    }

    private String getHeader() {

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("../CrudClient/properties/header.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty("frame");
    }
}
