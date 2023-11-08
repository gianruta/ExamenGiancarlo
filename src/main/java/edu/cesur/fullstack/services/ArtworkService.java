package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;

public interface ArtworkService {
	
	ArrayList<ArtworkDTO> getAllArtworks();
	void createArtwork(ArtworkDTO artworkDTO);
	ArtworkDTO getArtworkById(Integer id);
	ArtworkDTO saveArtwork(ArtworkDTO artwork);
	ArtworkDTO deleteArtwork(Integer id);

}
