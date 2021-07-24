package br.edu.ifrs.restinga.jnccinemas.enums;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilterOption {

	NAME("nome"), CAST("elenco"), GENRE("genero"), WRITER("escritor"), DIRECTOR("diretor"), DESCRIPTION("descrição");

	private String filterLabel;

	public static FilterOption findByFilterLabel(String filterLabel) {
		return Arrays.asList(FilterOption.values()).stream()
				.filter(option -> option.getFilterLabel().equalsIgnoreCase(filterLabel)).findFirst().orElse(null);
	}

}
