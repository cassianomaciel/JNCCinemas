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
public class Ingresso {
	
	@Id
	public String id;
	
	private BigDecimal preco;
	private Session sessao;
	private Seat cadeira;

}
