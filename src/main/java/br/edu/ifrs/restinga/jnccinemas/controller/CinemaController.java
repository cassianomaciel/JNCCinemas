package br.edu.ifrs.restinga.jnccinemas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.business.CinemaBusiness;
import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class CinemaController {

	
	@Autowired
	private CinemaBusiness cinemaBusiness;
	
	@ApiOperation(value = "Api operation modelo pra noix")
	@PostMapping("/cadastraCinema")
	@ResponseBody
	public ResponseEntity<Cinema> createTicket(@ApiParam(value = "Cinema a ser cadastrado no mongo", required = true)
	@RequestBody @Valid Cinema cinema) throws Exception {
		return ResponseEntity.ok(cinemaBusiness.saveCinema(cinema));
	}
}
