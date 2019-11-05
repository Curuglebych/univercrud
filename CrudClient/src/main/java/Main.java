import view.DefaultFrame;

import javax.swing.*;

public class Main {

    private static DefaultFrame defaultFrame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initDefFrame();
            }
        });
    }

    private static void initDefFrame() {
        defaultFrame = DefaultFrame.getInstanse();
    }
}
