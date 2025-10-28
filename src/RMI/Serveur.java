// SUPPRIME CETTE LIGNE :
package RMI;

// GARDE LE RESTE :
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("Registre RMI démarré sur le port 1099");
            
            HelloServiceImpl objetHello = new HelloServiceImpl();
            Naming.rebind("rmi://localhost:1099/HelloService", objetHello);
            
            System.out.println("Serveur RMI prêt!");
            System.out.println("En attente des requêtes clients...");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}