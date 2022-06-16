package com.Task_28_04_22;

public class BookStoreRunner {

	public static void main(String[] args) {
		OrderProcessor bookOrder = new OrderProcessor();
		bookOrder.getOrderFromTheCustomer();
		bookOrder.printOrderDetails(bookOrder.getOrderFromTheCustomer());
	}

}