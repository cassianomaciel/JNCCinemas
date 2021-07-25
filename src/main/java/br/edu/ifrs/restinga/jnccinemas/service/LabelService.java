package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.enums.FilterOption;
import br.edu.ifrs.restinga.jnccinemas.enums.MovieGenre;

@Service
public class LabelService {

	public List<String> retrieveGenres() {
		return Arrays.asList(MovieGenre.values()).stream().map(genre -> genre.getLabel()).collect(Collectors.toList());
	}

	public List<String> retriveFilterOptions() {
		return Arrays.asList(FilterOption.values()).stream().map(filter -> filter.getFilterLabel())
				.collect(Collectors.toList());

	}
}
