package br.edu.ifrs.restinga.jnccinemas.resource;

import br.edu.ifrs.restinga.jnccinemas.dtos.AbstractEvent;
import br.edu.ifrs.restinga.jnccinemas.service.EventService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventResource {

	private EventService eventService;

	public EventResource(EventService eventService) {
		this.eventService = eventService;
	}

	@ApiOperation(value = "Api para persistência de eventos")
	@PostMapping("/cadastraEvento")
	@ResponseBody
	public ResponseEntity<AbstractEvent> createTicket(
			@ApiParam(value = "Evento a ser cadastrado", required = true) @RequestBody @Valid AbstractEvent event)
			throws Exception {
		return ResponseEntity.ok(eventService.saveEvent(event));
	}
}
