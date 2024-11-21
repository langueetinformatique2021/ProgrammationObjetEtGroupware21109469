package atelier06;

public class Felin extends Animal {
    // Attribut spécifique à la classe Felin
    protected boolean domestique = false;

    // Constructeur de la classe Felin
    public Felin(String espece, int nb_pattes) {
        super(espece, nb_pattes); // Appelle le constructeur de la classe Animal
    }

    // Implémentation de la méthode abstraite 'nom' de la classe Animal
    @Override
    public String nom() {
        return espece; // Retourne le nom de l'espèce
    }

    // Méthode spécifique à Felin
    public void presente() {
        String etat = domestique ? "domestique" : "sauvage";
        System.out.println("Je suis un félin " + etat + " de l'espèce : " + espece);
    }
}
