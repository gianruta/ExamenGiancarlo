package edu.cesur.fullstack.controllers;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.exceptions.ArtistNotFoundException;
import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.services.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistRestController {
	
	ArtistService artistService;
	public ArtistRestController(ArtistService artistService) {
		this.artistService = artistService;
	}
	
	@GetMapping
	public ResponseEntity<?> getAllArtist() {
		ArrayList<ArtistDTO> listaArtist = artistService.getAllArtist();
		return ResponseEntity.ok(listaArtist);
	}
	
	@PostMapping
	public ResponseEntity<?> saveArtist(@RequestBody ArtistDTO artist) {
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(artist.getId())
				.toUri();
		
		return (ResponseEntity<?>) ResponseEntity.created(location);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteArtist(@PathVariable Integer id) {

		if (id < 0) {
			return ResponseEntity.badRequest().build();
		}

		for (ArtistDTO artists : new ArrayList<ArtistDTO>()) {
			if (artists.getId() == id) {
				
				return ResponseEntity.noContent().build();
			}

		}

		return ResponseEntity.notFound().build();

	}
}
