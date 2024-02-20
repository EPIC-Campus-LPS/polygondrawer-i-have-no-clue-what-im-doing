package Controller;

import Model.Model;
import View.Application;

public class UndoController {
    Model model;
    Application app;

    public UndoController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    public void removeLastPoint(){
        // either remove last point from polygon or entire polygon
    }
}
