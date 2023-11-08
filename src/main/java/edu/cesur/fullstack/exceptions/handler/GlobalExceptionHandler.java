package edu.cesur.fullstack.exceptions.handler;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.exceptions.ArtistNotFoundException;
import edu.cesur.fullstack.exceptions.ArtworkNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler( ArtistNotFoundException.class )
	public ProblemDetail handleCocheNotFoundException(ArtistNotFoundException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Custom Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Artist");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
	@ExceptionHandler( ArtworkNotFoundException.class )
	public ProblemDetail handleCocheNotFoundException(ArtworkNotFoundException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Custom Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Artwork");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}

}
