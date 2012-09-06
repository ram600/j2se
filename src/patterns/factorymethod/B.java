/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.factorymethod;

/**
 *
 * @author admin
 */
public class B extends A {

    @Override
    public Hello getWord() {
        return new RussiaHello();
    }

}
