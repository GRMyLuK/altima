package com.game.cards;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.game.cards.entity.Carte;
import com.game.cards.service.JeuDeCarte;
import com.game.cards.utils.Tri;

public class Jouer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//On prépare le jeu de carte
		System.out.println("Préparation du jeu de carte...");
		JeuDeCarte jeuDeCarte = new JeuDeCarte();
		System.out.println("Le jeu de carte est prêt à l'emploi.");
		
		boolean tri = false;
		boolean enCours = true;
        try {
            while (enCours) {
            	if(tri) {
            		System.out.println("\r\nVeuillez choisir le mode de tri : croissant / décroissant ");
        			String line = scanner.nextLine();
            		
            		if("croissant".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.trierPaquet(Tri.ASC);
            			tri = false;
            			System.out.println("Le paquet de carte est maintenant trié.");
            		} else if("décroissant".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.trierPaquet(Tri.DESC);
            			tri = false;
            			System.out.println("Le paquet de carte est maintenant trié.");
            		} else {
            			System.out.printf("La commande %s n'est pas reconnu%n", line);
            		}
            	} else {
            		System.out.println("\r\nVeuillez saisie votre commande parmis les suivantes : Mélanger / Trier / Piocher / Afficher / Terminer : ");
            		String line = scanner.nextLine();
            		
            		if("mélanger".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.melangerPaquet();
            			System.out.println("Le paquet de carte est maintenant mélanger.");
            		} else if("trier".equalsIgnoreCase(line.trim())) {
            			tri = true;
            		} else if("piocher".equalsIgnoreCase(line.trim())) {
            			Carte carte = jeuDeCarte.piocherCarte();
            			System.out.printf("Vous avez pioché %s%n", carte.toString());
            		} else if("afficher".equalsIgnoreCase(line.trim())) {
            			System.out.println(jeuDeCarte);
            		} else if("terminer".equalsIgnoreCase(line.trim())) {
            			System.out.println("Merci d'avoir joué au jeu de carte. A bientôt.");
            			enCours = false;
            		} else {
            			System.out.printf("La commande %s n'est pas reconnu%n", line);
            		}
            	}
            	
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            System.out.println("System.in was closed; exiting");
        }
        scanner.close();
	}
}
