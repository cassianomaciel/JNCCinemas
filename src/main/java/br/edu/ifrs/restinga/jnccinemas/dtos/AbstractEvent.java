package br.edu.ifrs.restinga.jnccinemas.dtos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import br.edu.ifrs.restinga.jnccinemas.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="eventType")
@JsonSubTypes({       
    @JsonSubTypes.Type(value=Movie.class, name="MOVIE"),
    @JsonSubTypes.Type(value=Event.class, name="EVENT")       
}) 
@Document
public abstract class AbstractEvent {

	@Id
	private String id;
	private String name;
	private long length;
	private EventType eventType;

}
