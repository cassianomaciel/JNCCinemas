package br.edu.ifrs.restinga.jnccinemas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.ifrs.restinga.jnccinemas.dtos.Movie;

public interface EventRepository extends MongoRepository<Movie, String> {

	public List<Movie> findAllByNameContainingIgnoreCase(String name);

	public List<Movie> findAllByDescriptionContainingIgnoreCase(String name);

	public List<Movie> findAllByCastContainingIgnoreCase(String name);

	public List<Movie> findAllByDirectorsContainingIgnoreCase(String name);

	public List<Movie> findAllByGenreContainingIgnoreCase(String name);

	public List<Movie> findAllByWritersContainingIgnoreCase(String name);

}
