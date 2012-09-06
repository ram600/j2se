/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javabase.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author admin
 */
public class IAmRemote extends UnicastRemoteObject implements Remotable {

    public IAmRemote() throws RemoteException {
        super();
    }




    public String sayHello() throws RemoteException {
        return "Server say Hi";
    }

}
