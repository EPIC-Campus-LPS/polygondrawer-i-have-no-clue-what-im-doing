package View;

import javax.swing.*;

public class Application extends JFrame {
    private JPanel panel1;
    private JMenuItem Undo;
    private JMenu Edit;
    private JMenu Polygon;
    private JMenuItem Reset;

    public Application() {
        setTitle("Sample Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        ContentPane.setborder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
}
