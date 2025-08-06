package com.neelu.day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Student Record Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

 
    public static void addStudent() {
        System.out.print("Enter ID: ");
        long id = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(id, name, marks);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

   
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    
    public static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Student student : studentList) {
            if (student.getId() == id) {
                scanner.nextLine(); // consume newline
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();

                System.out.print("Enter new marks: ");
                double marks = scanner.nextDouble();

                student.setName(name);
                student.setMarks(marks);
                System.out.println("Student updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }


    public static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = scanner.nextInt();

        boolean removed = studentList.removeIf(student -> student.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}

