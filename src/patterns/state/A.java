/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.state;

/**
 *
 * @author admin
 */
public class A  implements Base,Stateable {


    protected Base stateOne;
    protected Base stateTwo;
    protected Base stateThree;

    protected Base now;

    public A() {
        stateOne = new StateOne(this);
        stateTwo = new StateTwo(this);
        stateThree = new StateThree(this);

        now = stateOne;
    }


    public void setState(Object b){
        now = (Base)b;
    }

    public void stateOne() {
        now.stateOne();
    }

    public void stateTwo() {
        now.stateTwo();
    }

    public void stateThree() {
        now.stateThree();
    }

    

   


}
