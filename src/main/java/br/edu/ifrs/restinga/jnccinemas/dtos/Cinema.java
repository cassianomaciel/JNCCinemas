package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Cinema {
	
	@Id
	public String id;
	 
	private String nome;
	
	private String state;
	
	private String city;
	
	private String address;
	
	private String neighborhood;

    private Double latitude;
    
    private Double longitude;
    
	private List<Sala> salas;
	private List<String> filmes;
	private List<Sessao> sessoes;

	
}
