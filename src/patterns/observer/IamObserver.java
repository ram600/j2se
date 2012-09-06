/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.observer;

/**
 *
 * @author admin
 */
public class IamObserver implements Observer{

    public IamObserver(Observable o) {
        o.addObserver(this);
    }



    public void update(Observable observer, Object data) {
        if(observer instanceof IAmObservable){
            IAmObservable iamob = (IAmObservable)observer;
            System.out.println("I hear you!!! And i know that b="+iamob.b+" and a = "+iamob.a);
        }
        
    }

    



}
