package Controller;

import View.Application;
import Model.Model;

public class ResetController {
    final Model model;
    final Application app;

    public ResetController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    public void reset(){
        model.removeAll();

        UpdateMenu.updateMenu(app, model);
        app.repaint();
    }
}
