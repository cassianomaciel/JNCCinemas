package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Cadeira {
	
	@Id
	public String id;
	
	private String identificador;
}
