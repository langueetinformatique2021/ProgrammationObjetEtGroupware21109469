package atelier06;

public class Chat extends Felin implements Domesticable {
    private String nom;

    // Constructeur de la classe Chat
    public Chat(String espece, int nb_pattes) {
        super(espece, nb_pattes);
    }

    // Implémentation de la méthode domestiquer de l'interface
    @Override
    public void domestiquer(String nom) {
        this.nom = nom;
        this.domestique = true; // Change l'état à domestique
    }

    // Implémentation de la méthode nom de l'interface
    @Override
    public String nom() {
        return this.nom;
    }

    // Redéfinir la méthode présente
    @Override
    public void presente() {
        super.presente();
        System.out.println("Je m'appelle " + nom + ".");
    }
}
