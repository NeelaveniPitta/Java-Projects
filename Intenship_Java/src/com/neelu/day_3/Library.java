package com.neelu.day_3;

import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books = new ArrayList<>();
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added " + book.getTitle());
	}
	
	public void displayBook() {
		if(books.isEmpty()) {
			System.out.println("No books available.");
		}
		else {
			for(Book book: books) {
				System.out.println(book);
			}
		}
	}
	
	public void issueBook(int bookId, User user) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book '" + book.getTitle() + "' returned.");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}
