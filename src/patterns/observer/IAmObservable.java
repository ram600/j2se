/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.observer;

import java.util.HashSet;

/**
 *
 * @author admin
 */
public class IAmObservable extends Observable {
    protected HashSet<Observer> o = new HashSet<Observer>();

    public  String a;
    public String b;

    protected Boolean change = false;

    @Override
    public void inform() {
        if(change){
            for(Observer observer:o){
                observer.update(this, a);
            }
            change = false;
        }
    }

    @Override
    public void addObserver(Observer o) {
        this.o.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.o.remove(o);
    }

    @Override
    public void setChanged() {
        change = true;
    }
    


}
