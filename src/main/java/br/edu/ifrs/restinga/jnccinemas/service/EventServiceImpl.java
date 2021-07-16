package br.edu.ifrs.restinga.jnccinemas.service;

import br.edu.ifrs.restinga.jnccinemas.dtos.AbstractEvent;
import br.edu.ifrs.restinga.jnccinemas.enums.FilterOption;
import br.edu.ifrs.restinga.jnccinemas.exceptions.InvalidFilterException;
import br.edu.ifrs.restinga.jnccinemas.repository.EventRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;

	public EventServiceImpl(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	@Override
	public AbstractEvent saveEvent(AbstractEvent event) {
		if (event.getId() == null) {
			return eventRepository.insert(event);
		} else {
			return eventRepository.save(event);
		}
	}

	@Override
	public Optional<AbstractEvent> searchEvent(String filterOption, String value) {
		FilterOption option = FilterOption.findByFilterLabel(filterOption);
		if (option == null) {
			throw new InvalidFilterException("Filter not found for value " + filterOption);
		}
		// TODO implement multiple searches
		return null;
	}

}
