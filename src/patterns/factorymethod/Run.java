/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.factorymethod;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A c = new C();
       c.greeting();

       A b = new B();
       b.greeting();
    }

}
