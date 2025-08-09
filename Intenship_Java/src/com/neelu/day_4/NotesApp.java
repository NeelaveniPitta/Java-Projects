package com.neelu.day_4;

import java.io.*;
import java.util.Scanner;

public class NotesApp {

	private static final String FILE_NAME = "notes.txt";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n--- Notes App ---");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            case 1:
            	System.out.println("enter your note: ");
            	String note = sc.nextLine();
            	addNote(note);
            	break;
            case 2:
            	viewNotes();
                break;
            case 3:
            	System.out.println("Exiting... Goodbye!");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice. Try again.");
            
            }

		}
	}
	private static void addNote(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { 
            writer.write(note + System.lineSeparator());
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
    }
	private static void viewNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Saved Notes ---");
            while ((line = reader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Add a note first!");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }
}
