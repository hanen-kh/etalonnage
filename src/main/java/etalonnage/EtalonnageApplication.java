package etalonnage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class EtalonnageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtalonnageApplication.class, args);
		String cheminFichier = "C:\\Users\\dell\\Desktop\\etalonnage\\document.txt";
		int somme = 0;

		try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {
			String ligne;

			while ((ligne = lecteur.readLine()) != null) {
				ligne = ligne.trim();

				// Détection du premier chiffre de gauche à droite
				Integer premierChiffreGauche = null;
				Integer premierChiffreDroite = null;

				// Trouver le premier chiffre de gauche
				for (int i = 0; i < ligne.length(); i++) {
					if (Character.isDigit(ligne.charAt(i))) {
						premierChiffreGauche = Character.getNumericValue(ligne.charAt(i));
						break;
					}
				}

				// Trouver le premier chiffre de droite
				for (int i = ligne.length() - 1; i >= 0; i--) {
					if (Character.isDigit(ligne.charAt(i))) {
						premierChiffreDroite = Character.getNumericValue(ligne.charAt(i));
						break;
					}
				}

				// Vérification si les deux chiffres ont été trouvés
				if (premierChiffreGauche != null && premierChiffreDroite != null) {
					int valeurEtalonnage = premierChiffreGauche * 10 + premierChiffreDroite;
					somme += valeurEtalonnage;

				} else {
					System.out.println("Ligne ignorée : \"" + ligne + "\" (aucun chiffre détecté)");
				}
			}

			System.out.println("Somme totale des valeurs d'étalonnage : " + somme);

		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}
	}
}
