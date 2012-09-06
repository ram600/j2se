/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.state;

/**
 *
 * @author admin
 */
public class StateThree implements Base {

    protected Stateable s;

    public StateThree(Stateable s) {
        this.s = s;
    }

   public void stateOne() {
        System.out.println("State One CLOSE");
    }

    public void stateTwo() {
        System.out.println("State Two CLOSE");
    }

    public void stateThree() {
        System.out.println("State Three OPEN");
        s.setState(new StateOne(s));
    }

}
