package View;

import Model.Model;

import javax.swing.JPanel;
import java.awt.*;
import java.util.Iterator;

public class PolygonDrawer extends JPanel {

    public static final int RADIUS = 2;

    Model model;

    public PolygonDrawer(Model m) {
        this.model = m;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Iterator<Polygon> it = model.iterator();
        while (it.hasNext()){
            Polygon poly = it.next();

            //draw lines if closed, otherwise just points.
            if (poly.npoints >= 3){
                for (int i = 0; i < poly.npoints-1; i++){
                    g.drawLine(poly.xpoints[i], poly.ypoints[i], poly.xpoints[i+1], poly.ypoints[i+1]);
                }
                g.drawLine(poly.xpoints[poly.npoints-1], poly.ypoints[poly.npoints-1], poly.xpoints[0], poly.ypoints[0]);
            } else {
                for (int i = 0; i < poly.npoints; i++){
                    g.drawOval(poly.xpoints[i]-RADIUS, poly.ypoints[i]-RADIUS, 2*RADIUS, 2*RADIUS);
                }
            }

        }
    }
}
