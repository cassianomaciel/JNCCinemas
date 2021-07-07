package br.edu.ifrs.restinga.jnccinemas.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

	public Cinema findIngressoByNome(String nome);
	
	public Cinema save(Cinema cinema);
	
}
