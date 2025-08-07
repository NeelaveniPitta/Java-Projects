package com.neelu.day_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library l1 = new Library();
		Scanner sc = new Scanner(System.in);
		
		User u1 = new User(1, "Neelu");
		
		while(true) {
			 System.out.println("--- Library Menu ---");
	         System.out.println("1. Add Book");
	         System.out.println("2. View Books");
	         System.out.println("3. Issue Book");
	         System.out.println("4. Return Book");
	         System.out.println("5. Exit");
	         System.out.print("Enter choice: ");
	         
	         int choice = sc.nextInt();
	         switch (choice) {
			 case 1:
				 System.out.println("Enter Book ID: ");
				 int id = sc.nextInt();
				 sc.nextLine();
				 System.out.print("Enter Book Title: ");
                 String title = sc.nextLine();
                 Book b1 = new Book(id, title, true);
                 l1.addBook(b1);
                 break;
			 case 2:
				 l1.displayBook();
				 break;
			 case 3:
				 System.out.println("Enter Book ID to issue: ");
				 int issueId = sc.nextInt();
                 l1.issueBook(issueId, u1);
                 break;
			 case 4:
				 System.out.println("Enter Book ID to return:");
				 int returnId = sc.nextInt();
                 l1.returnBook(returnId);
                 break;
			 case 5:
				 System.out.println("Exiting... Thank you!");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid choice.");  
	         }		
		}
		
	}
}
