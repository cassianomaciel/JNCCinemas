package br.edu.ifrs.restinga.jnccinemas.dtos;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import br.edu.ifrs.restinga.jnccinemas.enums.RoomSeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Room {
	
	@Id
	public String id;
	
	private String cinemaId;
	private String roomName;
	private Integer roomSeats;
	private RoomSeatType seatType;
	
	/**
	 * Not implemented yet.
	 */
	private Map<String, List<Seat>> cadeiras;
	
}
