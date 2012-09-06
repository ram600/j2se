/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.facade;

/**
 *
 * @author admin
 */
public class ABFacade {

    public A a;
    public B b;

    public ABFacade(A a,B b) {
        this.a = a;
        this.b = b;
    }

    public String getNameAAndB(){
        return a.getName()+" "+b.getMyNmae();
    }





}
