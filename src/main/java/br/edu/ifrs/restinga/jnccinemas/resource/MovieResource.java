package br.edu.ifrs.restinga.jnccinemas.resource;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.dtos.Movie;
import br.edu.ifrs.restinga.jnccinemas.service.MovieService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class MovieResource {

	private MovieService eventService;

	public MovieResource(MovieService eventService) {
		this.eventService = eventService;
	}

	@ApiOperation(value = "Api para persistência de eventos")
	@PostMapping("/cadastraEvento")
	@ResponseBody
	public ResponseEntity<Movie> createEvent(
			@ApiParam(value = "Evento a ser cadastrado", required = true) @RequestBody @Valid Movie event)
			throws Exception {
		return ResponseEntity.ok(eventService.saveEvent(event));
	}
}
