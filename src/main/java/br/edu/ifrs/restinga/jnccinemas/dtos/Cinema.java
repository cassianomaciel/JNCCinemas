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
public class Cinema {
	
	@Id
	public String id;
	 
	private String nome;
	private List<Sala> salas;
	List<String> filmes;
	List<Sessao> sessoes;
	private String localizacao;
	
	
	
}
