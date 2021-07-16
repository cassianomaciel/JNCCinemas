package br.edu.ifrs.restinga.jnccinemas.dtos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import br.edu.ifrs.restinga.jnccinemas.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public abstract class AbstractEvent {

	@Id
	private String id;
	private String name;
	private long length;
	private EventType eventType;

}
