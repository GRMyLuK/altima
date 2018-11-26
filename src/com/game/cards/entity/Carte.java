package com.game.cards.entity;

import java.io.Serializable;

import com.game.cards.utils.CouleurDeCarte;
import com.game.cards.utils.SymboleDeCarte;

public class Carte implements Serializable, Comparable<Carte> {
	private static final long serialVersionUID = 7882344036915752685L;
	
	private CouleurDeCarte couleur;
	private SymboleDeCarte symbole;
	private int chiffre;
	
	public Carte(CouleurDeCarte couleur, SymboleDeCarte symbole, int chiffre) {
		this.couleur = couleur;
		this.symbole = symbole;
		this.chiffre = chiffre;
	}
	
	public CouleurDeCarte getCouleur() {
		return couleur;
	}
	public SymboleDeCarte getSymbole() {
		return symbole;
	}
	public Integer getChiffre() {
		return chiffre;
	}

	public int compareTo(Carte o) {
		if(this.getCouleur().compareTo(o.getCouleur()) == 0) {
			if(this.getSymbole().compareTo(o.getSymbole()) == 0) {
				return this.chiffre - o.getChiffre();
			} else {
				return this.getSymbole().compareTo(o.getSymbole());
			}
		} else {
			return this.getCouleur().compareTo(o.getCouleur());
		}
	}

	public String toString() {
		return "Carte ["+this.chiffre+" de "+this.symbole.getNomSymbole()+" "+this.couleur.getNomCouleur()+"]";
	}
	
}
