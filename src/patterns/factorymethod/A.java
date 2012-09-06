/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.factorymethod;

/**
 *
 * @author admin
 */
 public abstract class A {

    public void greeting(){
            Hello word = this.getWord();
            word.hello();

    }

    public abstract Hello  getWord();





}
