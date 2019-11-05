import model.CrudModel;
import view.DefaultFrame;
import view.MainView;

import javax.swing.*;

public class Main {

    private static DefaultFrame defaultFrame;
    private static MainView mainView;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                mainView = new MainView();
                CrudModel.setMainView(mainView);

                CrudModel.init();

                initDefFrame();

                CrudModel.setDefaultFrame(defaultFrame);
                defaultFrame.add(mainView);
            }
        });
    }

    private static void initDefFrame() {
        defaultFrame = DefaultFrame.getInstanse();
    }
}
