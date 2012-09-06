/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javabase.rmi;

import java.rmi.Naming;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            IAmRemote rm = new IAmRemote();
            Naming.bind("IAmREmote", rm);
        } catch (Exception e) {
        }
    }

}
