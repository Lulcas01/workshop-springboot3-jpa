package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Object id) {
		super("RESOURCE NOT FOUND" + id);
	}

}