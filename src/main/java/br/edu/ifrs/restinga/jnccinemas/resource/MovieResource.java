package br.edu.ifrs.restinga.jnccinemas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.dtos.Movie;
import br.edu.ifrs.restinga.jnccinemas.enums.FilterOption;
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

	@ApiOperation(value = "Api para busca de eventos")
	@GetMapping("/buscaEvento")
	@ResponseBody
	public ResponseEntity<List<Movie>> createEvent(
			@ApiParam(value = "Valor do filtro", required = false) @RequestParam(required = false) String value,
			@ApiParam(value = "Tipo de filtro", required = false) @RequestParam(required = false) String filterOption) {
		if (filterOption == null && value == null) {
			return ResponseEntity.ok(eventService.findAllEvents());
		}
		return ResponseEntity.ok(eventService.searchEvent(filterOption, value));
	}
}
