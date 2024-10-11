package com.bptn.course._22_big_coding._out_of_stock;

public class OutOfStockException extends Exception {

	private static final long serialVersionUID = 1L;

	public String message;

	public OutOfStockException(String message) {
		super(message);
	}

}
