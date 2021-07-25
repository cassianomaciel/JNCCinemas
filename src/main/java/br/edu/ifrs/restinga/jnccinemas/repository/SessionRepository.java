package br.edu.ifrs.restinga.jnccinemas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.restinga.jnccinemas.dtos.Session;

@Repository
public interface SessionRepository extends MongoRepository<Session, String> {

	public List<Session> findAllByCinemaId(String cinemaId);

	public List<Session> findAllByMovieId(String movie);

}
