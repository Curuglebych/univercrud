package model;

import view.DefaultFrame;
import view.MainView;
import view.StartView;

public class CrudModel {

    private static DefaultFrame defaultFrame;
    private static MainView mainView;
    private static StartView startView;

    /*
    Устанавкливает первое окно программы
     */
    public static void init() {
        setStartView();
    }

    public static void setStartView() {

        startView = new StartView();
        mainView.setPanel(startView);
    }

    public static void auth() {

    }

    public static void setDefaultFrame(DefaultFrame defaultFrame) {
        CrudModel.defaultFrame = defaultFrame;
    }

    public static void setMainView(MainView mainView) {
        CrudModel.mainView = mainView;
    }
}
