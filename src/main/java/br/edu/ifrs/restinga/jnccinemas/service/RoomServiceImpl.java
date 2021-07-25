package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.dtos.Room;
import br.edu.ifrs.restinga.jnccinemas.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public Room saveRoom(Room room) {
		return roomRepository.insert(room);

	}

	public List<Room> getByCinemaId(String cinemaId) {
		return roomRepository.findAllByCinemaId(cinemaId);
	}
}
