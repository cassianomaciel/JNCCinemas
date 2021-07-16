package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.time.LocalDate;
import java.util.List;

import br.edu.ifrs.restinga.jnccinemas.enums.MovieGenre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Movie extends AbstractEvent {

	private LocalDate releaseDate;
	private List<String> cast;
	private List<String> directors;
	private List<String> writers;
	private List<MovieGenre> genre;
	private byte[] bannerImage;
	private String trailerLink;
	private String imdbPage;

}
