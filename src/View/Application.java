package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controller.AddPointController;
import Model.Model;

/**
 * Generates the view of the application
 *
 * @author Cardin N, Cameron S
 * @version 1.0, 2/9/2024
 * @see EmptyBorder
 * */
public class Application extends JFrame {
    private JPanel contentPane;
    private JMenu Polygon;
    private JMenuItem Reset;
    private JMenu Edit;
    private JMenuItem Undo;

    JMenu menu_Polygon;
    JMenuItem menuItem_Reset;
    JMenu menu_Edit;
    JMenuItem menuItem_Undo;

    Model model;

    /**
     * Generates the menus and the dropdown bars
     * @param m
     */

    public Application (Model m){
        super();
        this.model = m;

        //creates the Frame in which we are going to make the polygon, Sets size, and name

        setTitle("Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        //we generate all the menus here
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu_Polygon = new JMenu("Polygon");
        menuBar.add(menu_Polygon);

        menuItem_Reset = new JMenuItem("Reset");
        menuItem_Reset.setAccelerator(KeyStroke.getKeyStroke("Control N"));
        menu_Polygon.add(menuItem_Reset);

        menu_Edit = new JMenu("Edit");
        menuBar.add(menu_Edit);

        menuItem_Undo = new JMenuItem("Undo");
        menuItem_Undo.setAccelerator(KeyStroke.getKeyStroke("Control Z"));
        menu_Edit.add(menuItem_Undo);

        //sets up the content pane and it uses PolygonDrawer
        contentPane = new PolygonDrawer(model);
        contentPane.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                new AddPointController(Application.this,model).addPoint(e.getPoint());
            }
        });
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

    }

    /**
     * Allows WindowBuilder not to complain
     */
    public Application(){
        this (new Model());
    }

    /**
     * Extracts the menu item undo variable
     * @return menu item undo
     */

    public JMenuItem getUndoMenuItem(){
        return menuItem_Undo;
    }

    /**
     * Extracts the menu item reset variable
     * @return menu item reset
     */
    public JMenuItem getResetMenuItem(){
        return menuItem_Reset;
    }

    /**
     * Extracts the polygon drawer so we can access it
     * @return content pane
     */

    public JPanel getPolygonDrawer(){
        return contentPane;
    }
}
