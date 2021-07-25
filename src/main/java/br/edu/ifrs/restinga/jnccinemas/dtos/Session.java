package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Session {

	@Id
	private String id;
	private BigDecimal ticketBasePrice;
	private String cinemaId;
	private String movieId;
	private String roomId;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<LocalDateTime> days;
}
