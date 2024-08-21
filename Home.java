import javax.swing.*;
import java.awt.*;

public class Home {
    private JFrame frame;

    public Home() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Add components to the frame as needed
        JLabel label = new JLabel("Welcome Admin");
        frame.add(label);

        frame.setVisible(true);
    }
}