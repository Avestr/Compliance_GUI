import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
    public class Main implements ActionListener {
        private static JPasswordField passwordText;
        private static JTextField text;
        private static JFrame frame;

        public static void main(String[] args) {
            frame = new JFrame();
            frame.setTitle("System Login");
            frame.setSize(450, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            
            JPanel panel = new JPanel();
            placeComponents(panel);
            frame.setVisible(true); 
            frame.add(panel);
        }
            private static <Jbutton> void placeComponents(JPanel panel) {

                panel.setLayout(null);

                JLabel label = new JLabel("Username:");
                label.setBounds(50, 60, 80, 25);
                panel.add(label);

                text = new JTextField();
                text.setBounds(120, 60, 200, 25);
                panel.add(text);
                
                JLabel password = new JLabel("Password:");
                password.setBounds(50, 100, 80, 25);
                panel.add(password);

                 passwordText = new JPasswordField();
                passwordText.setBounds(120, 100, 200, 25);
                panel.add(passwordText);

                JButton button = new JButton("Login");
                button.setBounds(240, 150, 80, 25);
                button.addActionListener(new Main());
                panel.add(button);

                JButton clearButton = new JButton("Clear");
                clearButton.setBounds(140, 150, 80, 25);
                clearButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text.setText("");
                        passwordText.setText("");
                    }

                });
                panel.add(clearButton);
               
            
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if(text.getText().equals("Admin") && passwordText.getText().equals("admin")) {
                    frame.dispose();
                    new Home();
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "Wrong username or password");
                } 
            }

    }