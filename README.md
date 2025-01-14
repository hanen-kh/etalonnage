# etalonnage
Ce projet Java est conçu pour lire un fichier texte contenant des lignes de texte,
extraire les deux premiers chiffres de chaque ligne (le premier chiffre de gauche et celui de droite), 
calculer une valeur d'étalonnage basée sur ces chiffres, et afficher la somme totale des valeurs d'étalonnage.

Prérequis
Fichier d'entrée : Un fichier texte contenant les lignes de texte à analyser.
Le chemin vers ce fichier doit être correctement défini dans la variable cheminFichier dans le code.

Structure du Code
Le code se compose des étapes principales suivantes :

Lecture du fichier :

Le fichier spécifié par cheminFichier est lu ligne par ligne à l'aide de BufferedReader.
Extraction des chiffres :

Pour chaque ligne, le premier chiffre de gauche et le premier chiffre de droite sont détectés.
Calcul de la valeur d'étalonnage :

Si les deux chiffres sont trouvés, une valeur d'étalonnage est calculée comme suit :
valeurEtalonnage = premierChiffreGauche * 10 + premierChiffreDroite
La valeur est ajoutée à une somme totale.
Gestion des erreurs :

Si une ligne ne contient aucun chiffre, elle est ignorée et un message est affiché.
Affichage des résultats :

À la fin, la somme totale des valeurs d'étalonnage est affichée.
