package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.Optional;

import br.edu.ifrs.restinga.jnccinemas.dtos.AbstractEvent;

public interface EventService {

	public AbstractEvent saveEvent(AbstractEvent event);
	
	public Optional<AbstractEvent> searchEvent(String filterOption, String value);
}
