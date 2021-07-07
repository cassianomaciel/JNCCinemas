package br.edu.ifrs.restinga.jnccinemas.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {
	
	private Sessão sessao;
	private Cliente cliente;

}
