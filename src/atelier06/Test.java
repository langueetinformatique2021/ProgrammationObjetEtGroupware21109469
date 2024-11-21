package atelier06;

public class Test {
    public static void main(String[] args) {
        // Créer un chat
        Chat monChat = new Chat("Chat européen", 4);

        // Tester les méthodes
        monChat.domestiquer("Minou");
        monChat.presente();
    }
}
