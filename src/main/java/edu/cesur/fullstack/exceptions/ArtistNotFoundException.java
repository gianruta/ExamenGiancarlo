package edu.cesur.fullstack.exceptions;

public class ArtistNotFoundException extends RuntimeException{
	
	public ArtistNotFoundException(String message) {
        super(message);
    }

}
