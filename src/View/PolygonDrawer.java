package View;

import Model.Model;

import javax.swing.JPanel;
import java.awt.*;

public class PolygonDrawer extends JPanel {

    Model model;

    public PolygonDrawer(Model m) {
        this.model = m;
    }
}
