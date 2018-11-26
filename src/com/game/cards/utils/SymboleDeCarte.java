package com.game.cards.utils;

public enum SymboleDeCarte {
	TREFLE("trèfle", 1), CARREAU("carreau", 2), COEUR("coeur", 3), PIQUE("pique", 4);
	
	private String nomSymbole;
	private int ordre;
	
	private SymboleDeCarte(String nomSymbole, int ordre) {
		this.nomSymbole = nomSymbole;
		this.ordre = ordre;
	}
	
	public String getNomSymbole() {
		return this.nomSymbole;
	}
	public int getOrdre() {
		return ordre;
	}
	
	public int compare(CouleurDeCarte c1, CouleurDeCarte c2) {
		return c1.getOrdre() - c2.getOrdre();
    }
}
