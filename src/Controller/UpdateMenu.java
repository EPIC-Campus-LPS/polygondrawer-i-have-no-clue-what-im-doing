package Controller;

import View.Application;
import Model.Model;

public class UpdateMenu {

    public static void updateMenu(Application app, Model model){
        if(model.size() == 0){
            app.getResetMenuItem().setEnabled(false);
            app.getUndoMenuItem().setEnabled(false);
            app.getUndoMenuItem().setText("Remove");
        } else {
            app.getResetMenuItem().setEnabled(true);
            app.getUndoMenuItem().setEnabled(true);

            if(model.getSelect().isPresent()){
                app.getUndoMenuItem().setText("Remove last point");
            } else {
                app.getUndoMenuItem().setText("Remove Last Polygon");
            }
        }
    }

}
