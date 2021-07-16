package br.edu.ifrs.restinga.jnccinemas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifrs.restinga.jnccinemas.dtos.Cinema;

@Repository
public interface CinemaRepository extends MongoRepository<Cinema, String> {

	public Cinema findIngressoByNome(String nome);
}
