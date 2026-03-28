package Pr_8;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String printMsg() throws RemoteException;
}