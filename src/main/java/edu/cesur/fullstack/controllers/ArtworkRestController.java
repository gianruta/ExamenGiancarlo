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

import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;
import edu.cesur.fullstack.services.ArtistService;
import edu.cesur.fullstack.services.ArtworkService;

@RestController
@RequestMapping("/artwork")
public class ArtworkRestController {
	
	ArtworkService artworkService;
	public ArtworkRestController(ArtistService artistService) {
		this.artworkService = artworkService;
	}
	
	@GetMapping
	public ResponseEntity<?> getAllArtworks() {
		ArrayList<ArtworkDTO> obras = artworkService.getAllArtworks();
		return ResponseEntity.ok(obras);
	}
	
	@PostMapping
	public ResponseEntity<?> saveArtwork(@RequestBody ArtworkDTO artwork) {
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(artwork.getId())
				.toUri();
		
		return (ResponseEntity<?>) ResponseEntity.created(location);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteArtwork(@PathVariable Integer id) {

		if (id < 0) {
			return ResponseEntity.badRequest().build();
		}

		for (ArtworkDTO artworks : new ArrayList<ArtworkDTO>()) {
			if (artworks.getId() == id) {
				
				return ResponseEntity.noContent().build();
			}

		}

		return ResponseEntity.notFound().build();

	}
}
