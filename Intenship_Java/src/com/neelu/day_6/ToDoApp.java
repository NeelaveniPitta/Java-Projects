package com.neelu.day_6;

import javax.swing.*;
import java.awt.*;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInput;

    public ToDoApp() {
        setTitle("To-Do App");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
        taskInput = new JTextField();
        JButton addButton = new JButton("Add Task");

        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        JButton deleteButton = new JButton("Delete Task");

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(deleteButton, BorderLayout.SOUTH);

        add(panel);

        addButton.addActionListener(e -> addTask());
        deleteButton.addActionListener(e -> deleteTask());
        taskInput.addActionListener(e -> addTask()); 

        setVisible(true);
    }

    private void addTask() {
        String task = taskInput.getText().trim();
        if (!task.isEmpty()) {
            taskListModel.addElement(task);
            taskInput.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            taskListModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to delete.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoApp::new); 
    }
}

