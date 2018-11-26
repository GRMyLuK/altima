package com.game.cards;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.game.cards.entity.Carte;
import com.game.cards.service.JeuDeCarte;
import com.game.cards.utils.Tri;

public class Jouer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//On pr�pare le jeu de carte
		System.out.println("Pr�paration du jeu de carte...");
		JeuDeCarte jeuDeCarte = new JeuDeCarte();
		System.out.println("Le jeu de carte est pr�t � l'emploi.");
		
		boolean tri = false;
		boolean enCours = true;
        try {
            while (enCours) {
            	if(tri) {
            		System.out.println("\r\nVeuillez choisir le mode de tri : croissant / d�croissant ");
        			String line = scanner.nextLine();
            		
            		if("croissant".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.trierPaquet(Tri.ASC);
            			tri = false;
            			System.out.println("Le paquet de carte est maintenant tri�.");
            		} else if("d�croissant".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.trierPaquet(Tri.DESC);
            			tri = false;
            			System.out.println("Le paquet de carte est maintenant tri�.");
            		} else {
            			System.out.printf("La commande %s n'est pas reconnu%n", line);
            		}
            	} else {
            		System.out.println("\r\nVeuillez saisie votre commande parmis les suivantes : M�langer / Trier / Piocher / Afficher / Terminer : ");
            		String line = scanner.nextLine();
            		
            		if("m�langer".equalsIgnoreCase(line.trim())) {
            			jeuDeCarte.melangerPaquet();
            			System.out.println("Le paquet de carte est maintenant m�langer.");
            		} else if("trier".equalsIgnoreCase(line.trim())) {
            			tri = true;
            		} else if("piocher".equalsIgnoreCase(line.trim())) {
            			Carte carte = jeuDeCarte.piocherCarte();
            			System.out.printf("Vous avez pioch� %s%n", carte.toString());
            		} else if("afficher".equalsIgnoreCase(line.trim())) {
            			System.out.println(jeuDeCarte);
            		} else if("terminer".equalsIgnoreCase(line.trim())) {
            			System.out.println("Merci d'avoir jou� au jeu de carte. A bient�t.");
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
