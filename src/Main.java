import View.Application;
import java.awt.EventQueue;
import Model.Model;

public class Main {
    public static void main(String[] args) {

        Model m = new Model();
        Application frame = new Application(m);
        frame.setVisible(true);

    }
}