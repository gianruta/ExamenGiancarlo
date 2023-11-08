package edu.cesur.fullstack.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtworkDTO {
	
	@NotNull
	Integer id;
	String title;
	String description;
	Integer artistId;
	
	public ArtworkDTO (Integer id, String title, String description, Integer artistId) {
		this.id=id;
		this.title=title;
		this.description=description;
		this.artistId=artistId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

}
