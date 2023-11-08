package edu.cesur.fullstack.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtistDTO {
	
	@NotNull
	Integer id;
	String name;
	
	public ArtistDTO (Integer id, String name) {
		this.id=id;
		this.name=name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
