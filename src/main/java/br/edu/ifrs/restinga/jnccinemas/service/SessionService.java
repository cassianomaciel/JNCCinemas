package br.edu.ifrs.restinga.jnccinemas.service;

import java.util.List;

import br.edu.ifrs.restinga.jnccinemas.dtos.Session;

public interface SessionService {

	public Session saveSession(Session session);

	public List<Session> getByCinemaId(String cinemaId);

	public List<Session> getByMovieId(String movieId);

}
