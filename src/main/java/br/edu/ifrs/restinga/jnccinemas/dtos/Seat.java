package br.edu.ifrs.restinga.jnccinemas.dtos;

import org.springframework.data.annotation.Id;

import br.edu.ifrs.restinga.jnccinemas.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	
	@Id
	public String id;
	
	private String identifier;
	
	private SeatType seatType;
}
