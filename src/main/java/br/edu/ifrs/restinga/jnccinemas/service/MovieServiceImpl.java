package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.dtos.Movie;
import br.edu.ifrs.restinga.jnccinemas.enums.FilterOption;
import br.edu.ifrs.restinga.jnccinemas.exceptions.InvalidFilterException;
import br.edu.ifrs.restinga.jnccinemas.repository.EventRepository;

@Service
public class MovieServiceImpl implements MovieService {

	private EventRepository eventRepository;

	public MovieServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	@Override
	public Movie saveEvent(Movie event) {
		if (event.getId() == null) {
			return eventRepository.insert(event);
		} else {
			return eventRepository.save(event);
		}
	}

	@Override
	public List<Movie> searchEvent(String filterOption, String value) {
		FilterOption option = FilterOption.findByFilterLabel(filterOption);
		if (option == null) {
			throw new InvalidFilterException("Filter not found for value " + filterOption);
		}
		switch (option) {
		case CAST:
			return eventRepository.findAllByCastContainingIgnoreCase(value);
		case DESCRIPTION:
			return eventRepository.findAllByDescriptionContainingIgnoreCase(value);
		case DIRECTOR:
			return eventRepository.findAllByDirectorsContainingIgnoreCase(value);
		case GENRE:
			return eventRepository.findAllByGenreContainingIgnoreCase(value);
		case NAME:
			return eventRepository.findAllByNameContainingIgnoreCase(value);
		case WRITER:
			return eventRepository.findAllByWritersContainingIgnoreCase(value);
		default:
			return Collections.emptyList();
		}
	}

	@Override
	public List<Movie> findAllEvents() {
		return eventRepository.findAll();
	}

}
