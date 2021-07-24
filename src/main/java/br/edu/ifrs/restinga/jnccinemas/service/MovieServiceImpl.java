package br.edu.ifrs.restinga.jnccinemas.service;

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
			break;
		case DESCRIPTION:
			return eventRepository.findAllByDescriptionContainingIgnoreCase(value);
		case DIRECTOR:
			break;
		case GENRE:
			break;
		case NAME:
			return eventRepository.findAllByNameContainingIgnoreCase(value);
		case WRITER:
			break;
		default:
			break;
		}
		// TODO implement multiple searches
		return null;
	}

}
