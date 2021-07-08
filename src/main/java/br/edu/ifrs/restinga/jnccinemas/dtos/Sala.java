package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
	
	@Id
	public String id;
	
	private Integer numero;
	private List<Cadeira> cadeiras;
	
}