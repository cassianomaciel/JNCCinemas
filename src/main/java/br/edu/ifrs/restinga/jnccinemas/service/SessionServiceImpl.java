package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifrs.restinga.jnccinemas.dtos.Session;
import br.edu.ifrs.restinga.jnccinemas.repository.SessionRepository;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	public Session saveSession(Session Session) {
		return sessionRepository.insert(Session);

	}

	public List<Session> getByCinemaId(String cinemaId) {
		return sessionRepository.findAllByCinemaId(cinemaId);
	}

	@Override
	public List<Session> getByMovieId(String movieId) {
		return sessionRepository.findAllByMovieId(movieId);

	}
}
