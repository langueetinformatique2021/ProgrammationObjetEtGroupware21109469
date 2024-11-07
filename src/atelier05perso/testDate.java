package atelier05perso;

import atelier05perso.Date;

public class testDate {

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		// Instanciation de deux objets de type date
		Date today = new Date(); 
		Date dfin = new Date(14,7,2025);
		
		int nbJours=0; //Variable pour compter le nombre de jours

/**		today.Afficher(); dfin.Afficher();
		do { today.Incrementer(); today.Afficher(); }
		while (today.CompareTo(dfin));
		}
*/
		
		 // Boucle jusqu'à atteindre la date cible
        while (!today.estEgale(dfin)) { // Utilisez la méthode estEgale() modifiée
            today.Incrementer(); // Incrémente de un jour
            nbJours++; // Compte un jour supplémentaire
        }

        System.out.println("Nombre de jours jusqu'au 14 juillet 2025 : " + nbJours);
    }
}
