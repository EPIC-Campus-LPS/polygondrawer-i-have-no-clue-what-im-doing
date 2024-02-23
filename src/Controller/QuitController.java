package Controller;

import View.Application;

import javax.swing.*;

public class QuitController {
    public boolean confirm(Application app){
        return JOptionPane.showConfirmDialog(app, "Do you wish to exit Application?") == JOptionPane.OK_OPTION;
    }
}
