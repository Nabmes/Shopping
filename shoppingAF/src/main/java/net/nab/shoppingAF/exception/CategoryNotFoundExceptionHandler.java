package net.nab.shoppingAF.exception;

import java.io.Serializable;

public class CategoryNotFoundExceptionHandler extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public CategoryNotFoundExceptionHandler() {
		this("Category is not available!");
	}
	
	public CategoryNotFoundExceptionHandler(String message) {
		this.message = System.currentTimeMillis() + ": "+message;
	}
	
	public String getMessage() {
		return message;
	}

}
