package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;

public interface CinemaService {

	public Cinema saveCinema(Cinema cinema);
	
	public List<Cinema> searchCinema();
}
