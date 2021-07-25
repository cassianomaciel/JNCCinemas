package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import br.edu.ifrs.restinga.jnccinemas.dtos.Room;

public interface RoomService {

	public Room saveRoom(Room room);

	public List<Room> getByCinemaId(String cinemaId);
}
