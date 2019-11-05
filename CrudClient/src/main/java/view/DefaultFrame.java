package view;

import util.PropertyHelper;

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

        setTitle(PropertyHelper.getHeaderProperty("frame"));

        setResizable(false);

        setSize(new Dimension(1024,768));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static DefaultFrame getInstanse() {
        return new DefaultFrame();
    }

}
