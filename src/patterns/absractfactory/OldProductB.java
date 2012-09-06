/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.absractfactory;

/**
 *
 * @author admin
 */
public class OldProductB implements ProductB {

    public void iamB() {
        System.out.println("I am "+this.getClass().getName());
    }


}
