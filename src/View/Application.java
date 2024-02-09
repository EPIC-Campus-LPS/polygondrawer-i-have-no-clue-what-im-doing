package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Application extends JFrame {
    private JPanel contentPane;
    private JMenu Polygon;
    private JMenuItem Reset;
    private JMenu Edit;
    private JMenuItem Undo;

    public Application() {
        // Creates the Frame in which we are going to make the polygon, Sets size, and name

        setTitle("Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // We generate all the menus here
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu polygon = new JMenu("Polygon");
        menuBar.add(polygon);

        JMenuItem Reset = new JMenuItem("Reset");
        polygon.add(Reset);

        JMenu Edit = new JMenu("Edit");
        menuBar.add(Edit);

        JMenuItem Undo = new JMenuItem("Undo");
        Edit.add(Undo);
        //sets up the content pane and now makes it so it uses PolygonDrawer
        contentPane = new PolygonDrawer();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
}
