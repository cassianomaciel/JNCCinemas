package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
	
	private Integer numero;
	private Integer lugares;
	
}
