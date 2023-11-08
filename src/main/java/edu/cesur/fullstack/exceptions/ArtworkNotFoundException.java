package edu.cesur.fullstack.exceptions;

public class ArtworkNotFoundException extends RuntimeException{
	
	public ArtworkNotFoundException(String message) {
        super(message);
    }

}