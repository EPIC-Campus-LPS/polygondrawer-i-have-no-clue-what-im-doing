package Controller;

import Model.Model;
import View.Application;

import java.awt.*;
import java.util.Iterator;
import java.util.Optional;

public class UndoController {
    Model model;
    Application app;

    public UndoController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    public void removeLastPoint(){
        // either remove last point from polygon or entire polygon
        Optional<Polygon> selected = model.getSelect();
        if (selected.isPresent()) {
            //remove last point
            Polygon poly = selected.get();
            if (poly.npoints > 0){
                poly.npoints--;
            }
        } else {
            //remove last polygon
            Iterator<Polygon> it = model.iterator();
            while (it.hasNext()){
                if(it.hasNext()){
                    it.remove();
                    break;
                }
            }
        }

        UpdateMenu.updateMenu(app, model);
        app.repaint();
    }
}
