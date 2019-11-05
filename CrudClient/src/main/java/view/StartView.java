package view;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class StartView extends JPanel{

    public StartView() {

        setLayout(new MigLayout("debug"));

        init();
    }

    private void init() {

        add(new JButton("Ok"));
    }
}
