package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
    
    public HelloServiceImpl() throws RemoteException {
        super();
    }
    
    public String direBonjour() throws RemoteException {
        return "Bonjour le monde depuis le serveur RMI!";
    }
    
    public String direBonjourA(String nom) throws RemoteException {
        return "Bonjour " + nom + "! Comment ça va?";
    }
}