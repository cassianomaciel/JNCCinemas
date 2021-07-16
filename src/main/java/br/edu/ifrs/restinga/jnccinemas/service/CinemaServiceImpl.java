package br.edu.ifrs.restinga.jnccinemas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;
import br.edu.ifrs.restinga.jnccinemas.repository.CinemaRepository;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	CinemaRepository cinemaRepository;
	
	@Override
	public Cinema saveCinema(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}

}
