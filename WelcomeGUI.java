import javax.swing.*;
import java.awt.event.*;

public class WelcomeGUI {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Welcome Application");

        // Create a JButton
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 150, 40);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show welcome message dialog
                JOptionPane.showMessageDialog(frame, "Welcome to the Java GUI Application!");
            }
        });

        // Add button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setLayout(null); // Use absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
