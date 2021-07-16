package br.edu.ifrs.restinga.jnccinemas.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.edu.ifrs.restinga.jnccinemas.dtos.AbstractEvent;

public interface EventRepository extends MongoRepository<AbstractEvent, String>{
	
}
