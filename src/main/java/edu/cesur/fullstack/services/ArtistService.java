package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;


public interface ArtistService {
	
	ArtistDTO getArtistById(Integer id);
	
	ArrayList<ArtistDTO> getAllArtist();
	
	ArtistDTO saveArtist(ArtistDTO artist);
	
	ArtistDTO deleteArtist(Integer id);
	
	void createArtist(ArtistDTO artistDTO);
	
	

}
