import Controller.QuitController;
import Controller.UpdateMenu;
import Model.Model;
import View.Application;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        Model m = new Model();

        final Application frame = new Application(m);
        UpdateMenu.updateMenu(frame, m);

        // Disposing the window will complete the application
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                if (new QuitController().confirm(frame)) {
                    frame.dispose();
                }
            }
        });

        frame.setVisible(true);
    }

}