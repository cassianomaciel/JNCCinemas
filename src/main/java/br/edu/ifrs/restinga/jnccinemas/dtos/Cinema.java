package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
	
	private String nome;
	private List<Salas> salas;
	List<String> filmesDisponiveis;
	private String localizacao;
	private Map<Integer, String> avaliacoes;
	
	
}
