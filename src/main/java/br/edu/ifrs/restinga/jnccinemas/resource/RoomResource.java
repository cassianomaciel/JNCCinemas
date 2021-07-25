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

import br.edu.ifrs.restinga.jnccinemas.dtos.Room;
import br.edu.ifrs.restinga.jnccinemas.service.RoomService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class RoomResource {

	@Autowired
	private RoomService roomService;

	@ApiOperation(value = "Cadastra uma sala de cinema vinculada a um cinema")
	@PostMapping("/cadastraSala")
	@ResponseBody
	public ResponseEntity<Room> createCinema(
			@ApiParam(value = "Cinema a ser cadastrado no mongo", required = true) @RequestBody @Valid Room cinema)
			throws Exception {
		return ResponseEntity.ok(roomService.saveRoom(cinema));
	}

	@ApiOperation(value = "Busca cinemas")
	@GetMapping("/buscaSala")
	@ResponseBody
	public ResponseEntity<List<Room>> findByCinemaId(
			@ApiParam(value = "Id de um cinema", required = false) @RequestParam(required = false) String cinemaId)
			throws Exception {
		return ResponseEntity.ok(roomService.getByCinemaId(cinemaId));
	}
}
