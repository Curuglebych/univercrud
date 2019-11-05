package view;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class MainView extends JPanel{

    public MainView() {

        setLayout(new MigLayout());
    }

    public void setPanel(JPanel panel) {
        add(panel);
    }
}