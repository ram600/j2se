/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.strategy;

import patterns.strategy.HelloAction;
import patterns.strategy.A;

/**
 *
 * @author admin
 */
public class Run {


    public static void main(String[] args){
        A a = new A();
        SomeAction sa = new HelloAction();
        a.setSomeAction(sa);
        a.action();
    }
        
}
