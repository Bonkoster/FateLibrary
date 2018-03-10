package com.lukashman.FateLibrary.model;

public class Greeting {
	
	private final long id;
	private final String message;
	
	public Greeting(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
	
}
