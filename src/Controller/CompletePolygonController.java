package Controller;
import Model.Model;
import View.Application;

public class CompletePolygonController {
    private Model model;
    private Application app;

    public CompletePolygonController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    public void complete(){
        model.unselectPolygon();

        UpdateMenu.updateMenu(app,model);
        app.repaint();
    }
}
