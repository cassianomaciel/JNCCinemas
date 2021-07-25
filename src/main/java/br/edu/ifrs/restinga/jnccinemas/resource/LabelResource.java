package br.edu.ifrs.restinga.jnccinemas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.service.LabelService;
import io.swagger.annotations.ApiOperation;

@RestController
public class LabelResource {

	@Autowired
	private LabelService labelService;

	@ApiOperation(value = "Busca generos")
	@GetMapping("/generos")
	@ResponseBody
	public ResponseEntity<List<String>> getMovieGenres() throws Exception {
		return ResponseEntity.ok(labelService.retrieveGenres());
	}

	@ApiOperation(value = "Busca filtros de busca")
	@GetMapping("/filtros")
	@ResponseBody
	public ResponseEntity<List<String>> getFilterOptions() throws Exception {
		return ResponseEntity.ok(labelService.retriveFilterOptions());
	}

}
