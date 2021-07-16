package br.edu.ifrs.restinga.jnccinemas.enums;

public enum MovieGenre {

	ACTION("Ação"), ADVENTURE("Aventura"), DRAMA("Drama"), ROMANCE("Romance"), COMEDY("Comédia"),
	SCIFI("Ficção Científica"), OTHER("Outro"), THRILLER("Suspense"), HORROR("Terror"), DOCUMENTARY("Documentário"),
	BIOGRAPHY("Biografia"), MUSICAL("Musical"), ANIMATION("Animação"), ANIME("Anime");

	private String label;

	private MovieGenre(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
