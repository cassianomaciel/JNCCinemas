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

	private Movie filme;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<LocalDateTime> days;
	private Sala sala;
}
