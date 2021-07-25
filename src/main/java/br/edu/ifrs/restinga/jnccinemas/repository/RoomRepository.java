package br.edu.ifrs.restinga.jnccinemas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.restinga.jnccinemas.dtos.Room;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {

	public List<Room> findAllByCinemaId(String cinemaId);

}
