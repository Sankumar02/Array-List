package com.Task_28_04_22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderProcessor {

	public ArrayList<Book> getOrderFromTheCustomer() {

		Scanner bookLibrary = new Scanner(System.in);

		int bookCount = 0;

		try {
			System.out.println("Enter the Count : ");
			bookCount = bookLibrary.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Enter valid input : " + exception);
		}

		ArrayList<Book> bookList = new ArrayList<Book>();

		for (int index = 0; index < bookCount; index++) {
			bookList.add(getBookdataFromTheCustomer(bookCount));
		}

		return bookList;
	}

	public Book getBookdataFromTheCustomer(int bookCount) {
		int quantity = 0, id = 0;

		Scanner bookdetails = new Scanner(System.in);

		try {
			System.out.println("Enter the id : ");
			id = bookdetails.nextInt();

			System.out.println("Enter the quantity of book : ");
			quantity = bookdetails.nextInt();

		} catch (InputMismatchException e) {
			System.err.println("enter the integer as input");
			System.exit(0);
		}

		System.out.println("Enter the name of the book : ");
		String name = bookdetails.next();

		System.out.println("Enter the name of the author : ");
		String author = bookdetails.next();

		System.out.println("Enter the name of the publisher : ");
		String publisher = bookdetails.next();

		Book oBook = new Book(id, quantity, name, author, publisher);
		return oBook;

	}

	public void printOrderDetails(ArrayList<Book> bookList) {

		for (Book booklibrary : bookList) {
			System.out.println("ID Number : " + booklibrary.id);
			System.out.println("Name of the Book : " + booklibrary.name);
			System.out.println("Name of the Author : " + booklibrary.author);
			System.out.println("Book Quantity : " + booklibrary.quantity);
			System.out.println("Publisher of the Book : " + booklibrary.publisher);
		}

	}
}