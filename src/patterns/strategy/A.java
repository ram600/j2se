/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.strategy;

/**
 *
 * @author admin
 */
public class A {

    protected SomeAction sa;

    public void action(){
        this.sa.action();
    }

    public void setSomeAction(SomeAction sa){
        this.sa = sa;
    }


}
