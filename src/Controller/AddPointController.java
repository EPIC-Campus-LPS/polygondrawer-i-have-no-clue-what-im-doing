package Controller;

import View.Application;
import Model.Model;

import java.awt.*;
import java.util.Optional;

public class AddPointController {
    final Model model;

    final Application app;

    public AddPointController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    public void addPoint(Point p){
        Optional<Polygon> selected = model.getSelect();
        if(!selected.isPresent()){
            Polygon poly = new Polygon();
            poly.addPoint(p.x,p.y);

            model.addPolygon(poly);
            model.makeCurrent(poly);
        } else {
            selected.get().addPoint(p.x,p.y);
        }
        UpdateMenu.updateMenu(app, model);
        app.repaint();
    }
}
