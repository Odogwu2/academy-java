package com.bptn.course._22_big_coding._out_of_stock;

public class Main {

	public static void main(String[] args) {

		Store store = new Store();
		try {
			store.purchase("apple", 11);
			System.out.println("Purchase successful!");
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}

	}

}
