package com.taggy.training.webservices.handlers.server;

public class FibException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6420140016568867109L;
	private String details;

	public FibException(String reason, String details) {
		super(reason);
		this.details = details;
	}

	public String getFaultInfo() {
		return details;
	}
}