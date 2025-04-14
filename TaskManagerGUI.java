import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskManagerGUI extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskField;

    public TaskManagerGUI() {
        setTitle("Task Manager");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        setLayout(new BorderLayout());

        // Panel for task input
        JPanel inputPanel = new JPanel();
        taskField = new JTextField(20);
        JButton addButton = new JButton("Add Task");

        inputPanel.add(taskField);
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        // Task list model and list
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for action buttons
        JPanel buttonPanel = new JPanel();
        JButton deleteButton = new JButton("Delete Task");
        JButton completeButton = new JButton("Mark as Completed");
        JButton exitButton = new JButton("Exit");

        buttonPanel.add(deleteButton);
        buttonPanel.add(completeButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add Task action
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskField.setText(""); // Clear the text field
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a task.");
            }
        });

        // Delete Task action
        deleteButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to delete.");
            }
        });

        // Mark as Completed action
        completeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                String task = taskListModel.getElementAt(selectedIndex);
                // If already completed, show message
                if (!task.startsWith("[✓]")) {
                    taskListModel.set(selectedIndex, "[✓] " + task);
                } else {
                    JOptionPane.showMessageDialog(this, "This task is already marked as completed.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a task to mark as completed.");
            }
        });

        // Exit button action
        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true); // Show the GUI
    }

    public static void main(String[] args) {
        new TaskManagerGUI(); // Start the app
    }
}
