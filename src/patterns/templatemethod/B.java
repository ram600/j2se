/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.templatemethod;

/**
 *
 * @author admin
 */
public class B extends A {

    @Override
    public void templMethod() {
        System.out.println("I am Template methiod in class "+this.getClass().getName());
    }



}
