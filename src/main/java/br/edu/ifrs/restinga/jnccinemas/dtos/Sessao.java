package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Sessao {
	
	private Filme filme;
	private LocalDateTime data;
	private Sala sala;
}
