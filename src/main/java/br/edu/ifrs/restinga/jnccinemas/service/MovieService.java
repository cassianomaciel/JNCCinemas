package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import br.edu.ifrs.restinga.jnccinemas.dtos.Movie;

public interface MovieService {

	public Movie saveEvent(Movie event);
	
	public List<Movie> searchEvent(String filterOption, String value);

	public List<Movie> findAllEvents();
}
