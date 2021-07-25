package br.edu.ifrs.restinga.jnccinemas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.dtos.Session;
import br.edu.ifrs.restinga.jnccinemas.service.SessionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class SessionResource {

	@Autowired
	private SessionService sessionService;

	@ApiOperation(value = "Cadastra uma sessão vinculada a um cinema e a um evento")
	@PostMapping("/cadastraSessao")
	@ResponseBody
	public ResponseEntity<Session> createSession(
			@ApiParam(value = "Cinema a ser cadastrado no mongo", required = true) @RequestBody @Valid Session cinema)
			throws Exception {
		return ResponseEntity.ok(sessionService.saveSession(cinema));
	}

	@ApiOperation(value = "Busca sessoões por id de cinema")
	@GetMapping("/buscaSessao/cinema")
	@ResponseBody
	public ResponseEntity<List<Session>> findByCinemaId(
			@ApiParam(value = "Id de um cinema", required = false) @RequestParam(required = false) String cinemaId)
			throws Exception {
		return ResponseEntity.ok(sessionService.getByCinemaId(cinemaId));
	}

	@ApiOperation(value = "Busca sessoões por id de filme")
	@GetMapping("/buscaSessao/filme")
	@ResponseBody
	public ResponseEntity<List<Session>> findByMovieId(
			@ApiParam(value = "Id de um cinema", required = false) @RequestParam(required = false) String movie)
			throws Exception {
		return ResponseEntity.ok(sessionService.getByMovieId(movie));
	}
}
