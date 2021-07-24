package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.edu.ifrs.restinga.jnccinemas.enums.EventType;
import br.edu.ifrs.restinga.jnccinemas.enums.MovieGenre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Movie {
	
	@Id
	private String id;
	private String name;
	private long length;
	private String description;
	private EventType eventType;
	private LocalDate releaseDate;
	private List<String> cast;
	private List<String> directors;
	private List<String> writers;
	private List<MovieGenre> genre;
	private String bannerImage;
	private String trailerLink;
	private String imdbPage;

}
