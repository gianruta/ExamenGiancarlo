package edu.cesur.fullstack.services;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;

import java.util.ArrayList;
import java.util.Arrays;


@Service
public class ArtworkServiceImpl implements ArtworkService {
	
	ArrayList<ArtworkDTO> obras = new ArrayList<>();
	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	ArtworkDTO ar4 = new ArtworkDTO(4,"Titulo4", "hola soy la descripción cuatro",3);

	public ArtworkServiceImpl() {
	obras.add(ar);
	obras.add(ar2);
	obras.add(ar3);
	obras.add(ar4);
	}
	
	@Override
    public ArrayList<ArtworkDTO> getAllArtworks() {
        return obras;
    }
	
	@Override
    public void createArtwork(ArtworkDTO artworkDTO) {
        obras.add(artworkDTO);
    }

	@Override
	public ArtworkDTO getArtworkById(Integer id) {
		for (ArtworkDTO artwork : obras) {
	        if (artwork.getId() == id) {
	            return artwork;
	        }
	    }
	    return null;
	}

	@Override
	public ArtworkDTO saveArtwork(ArtworkDTO artwork) {
		obras.addAll(obras);
		return artwork;
	}

	@Override
	public ArtworkDTO deleteArtwork(Integer id) {
		for (ArtworkDTO artwork : obras) {
            if (artwork.getId() == id) {
                obras.remove(artwork);
                return artwork;
            }
        }
		return null;
	}
}
