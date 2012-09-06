/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.strategy;

/**
 *
 * @author admin
 */
public class HelloAction implements SomeAction{

    public void action() {
        System.out.println("Hello i am "+this.getClass().getName());
    }

}
