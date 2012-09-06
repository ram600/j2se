/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.observer;

/**
 *
 * @author admin
 */
public abstract class Observable {

    public abstract void inform();
    public abstract void addObserver(Observer o);
    public abstract void removeObserver(Observer o);
    public abstract void setChanged();
}
