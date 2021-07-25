package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;
import br.edu.ifrs.restinga.jnccinemas.repository.CinemaRepository;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaRepository cinemaRepository;

	@Override
	public Cinema saveCinema(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}

	@Override
	public List<Cinema> searchCinema() {
		return cinemaRepository.findAll();
	}

}
