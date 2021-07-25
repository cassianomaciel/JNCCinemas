package br.edu.ifrs.restinga.jnccinemas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;
import br.edu.ifrs.restinga.jnccinemas.service.CinemaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class CinemaResource {

	@Autowired
	private CinemaService cinemaBusiness;

	@ApiOperation(value = "Api operation modelo pra noix")
	@PostMapping("/cadastraCinema")
	@ResponseBody
	public ResponseEntity<Cinema> createCinema(
			@ApiParam(value = "Cinema a ser cadastrado no mongo", required = true) @RequestBody @Valid Cinema cinema)
			throws Exception {
		return ResponseEntity.ok(cinemaBusiness.saveCinema(cinema));
	}

	@ApiOperation(value = "Busca cinemas")
	@GetMapping("/buscaCinema")
	@ResponseBody
	public ResponseEntity<List<Cinema>> searchCinema() throws Exception {
		return ResponseEntity.ok(cinemaBusiness.searchCinema());
	}
}
