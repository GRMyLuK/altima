package com.game.cards.utils;

/**
 * CouleurDeCarte est une énumération représentant les couleurs de carte à jouer possible - Rouge et Noir.
 * <p>
 * En plus du nom de l'énumération textuelle, chaque couleur à une valeur int. La valeur int permet de determiner l'ordre.
 * <p>
 * @author GRMyLuK
 */
public enum CouleurDeCarte implements Comparable<CouleurDeCarte> {
	/**
	 * L'instance singleton pour la couleur de carte Rouge.
	 * Il a une valeur numérique de {@code 1}.
	 */
	ROUGE("rouge", 1),
	/**
	 * L'instance singleton pour la couleur de carte Noir.
	 * Il a une valeur numérique de {@code 2}.
	 */
	NOIR("noir", 2);
	
	private String nomCouleur;
	private int ordre;
	
	private CouleurDeCarte(String nomCouleur, int ordre) {
		this.nomCouleur = nomCouleur;
		this.ordre = ordre;
	}
	
	public String getNomCouleur() {
		return this.nomCouleur;
	}
	public int getOrdre() {
		return ordre;
	}
	
	public int compare(CouleurDeCarte c1, CouleurDeCarte c2) {
		return c1.getOrdre() - c2.getOrdre();
    }
}
