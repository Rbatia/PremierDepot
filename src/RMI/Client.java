package RMI;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Recherche de l'objet distant...");
            HelloService stub = (HelloService) Naming.lookup("rmi://localhost:1099/HelloService");
            System.out.println("Objet trouvé! Connexion établie.");
            
            // Appeler les méthodes à distance
            String message1 = stub.direBonjour();
            System.out.println("Réponse 1: " + message1);
            
            String message2 = stub.direBonjourA("Rbatia Aicha");
            System.out.println("Réponse 2: " + message2);
            
        } catch (Exception e) {
            System.err.println("Erreur client: " + e.getMessage());
            e.printStackTrace();
        }
    }
}