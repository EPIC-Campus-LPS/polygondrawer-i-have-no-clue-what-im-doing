import View.Application;
import java.awt.EventQueue;
import Model.Model;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        try {
            Model m = new Model();
            Application frame = new Application(m);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        });

    }
}