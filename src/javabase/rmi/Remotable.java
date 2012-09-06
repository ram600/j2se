/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javabase.rmi;

import java.rmi.RemoteException;

/**
 *
 * @author admin
 */
public interface Remotable extends java.rmi.Remote {
    public String sayHello()  throws RemoteException;
}
