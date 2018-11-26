package com.game.cards.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.game.cards.entity.Carte;
import com.game.cards.utils.CouleurDeCarte;
import com.game.cards.utils.SymboleDeCarte;
import com.game.cards.utils.Tri;

public class JeuDeCarte {
	private List<Carte> paquetDeCarte;
	
	public JeuDeCarte() {
		this.paquetDeCarte = new LinkedList<>();
		for(SymboleDeCarte symbole : SymboleDeCarte.values()) {
			for(CouleurDeCarte couleur : CouleurDeCarte.values()) {
				for(int chiffre=1; chiffre<=10; chiffre++) {
					Carte carte = new Carte(couleur, symbole, chiffre);
					this.paquetDeCarte.add(carte);
				}
			}
		}
	}

	public List<Carte> getPaquetDeCarte() {
		return this.paquetDeCarte;
	}
	
	public void melangerPaquet() {
		Collections.shuffle(this.paquetDeCarte);
	}
	
	public void trierPaquet(Tri tri) {
		Comparator<Carte> carteComparator = Comparator.comparing(Carte::getCouleur).thenComparing(Carte::getSymbole).thenComparing(Carte::getChiffre);
		Collections.sort(this.paquetDeCarte, carteComparator);
		if(Tri.DESC.equals(tri)) {
			Collections.reverse(this.paquetDeCarte);
		}
	}
	
	public Carte piocherCarte() {
		double random = Math.random();
		int pos = (int) (random * this.paquetDeCarte.size());
		return this.paquetDeCarte.get(pos);
	}

	public String toString() {
		String retour = "JeuDeCarte";
		for (Carte carte : this.paquetDeCarte) {
			retour = retour.concat("\r\n\t - ").concat(carte.toString());
		}
		return retour;
	}
	
}
