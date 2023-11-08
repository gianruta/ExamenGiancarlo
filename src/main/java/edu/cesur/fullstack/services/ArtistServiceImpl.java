package edu.cesur.fullstack.services;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.ArtistDTO;

import java.util.ArrayList;


@Service
public class ArtistServiceImpl implements ArtistService {
	
	ArrayList<ArtistDTO> artists = new ArrayList<>();
	
	ArtistDTO ar = new ArtistDTO(1, "Goya");
	ArtistDTO ar2 = new ArtistDTO(2, "Picasso");
	ArtistDTO ar3 = new ArtistDTO(3, "Dalí");
	ArtistDTO ar4 = new ArtistDTO(4, "Miró");
	
	public ArtistServiceImpl(){

		artists.add(ar);

		artists.add(ar2);

		artists.add(ar3);

		artists.add(ar4);

		}
	
	@Override
	public ArtistDTO getArtistById(Integer id) {
	    for (ArtistDTO artist : artists) {
	        if (artist.getId() == id) {
	            return artist;
	        }
	    }
	    return null;
	}

	@Override
	public ArrayList<ArtistDTO> getAllArtist() {
		return artists;
	}

	@Override
	public ArtistDTO saveArtist(ArtistDTO artist) {
		artists.addAll(artists);
		return artist;
	}

	@Override
	public ArtistDTO deleteArtist(Integer id) {
		for (ArtistDTO artist : artists) {
            if (artist.getId() == id) {
                artists.remove(artist);
                return artist;
            }
        }
		return null;
	}

	@Override
	public void createArtist(ArtistDTO artistDTO) {
		artists.add(artistDTO);
    }
		
	

}
