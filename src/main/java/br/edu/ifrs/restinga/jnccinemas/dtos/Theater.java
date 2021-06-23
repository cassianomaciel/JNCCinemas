package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Theater {
	
	private String name;
	private List<Session> sessions;
	private String localization;
	
	
}
