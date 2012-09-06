/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.state;

/**
 *
 * @author admin
 */
public class StateTwo implements Base {

   protected Stateable s;

    public StateTwo(Stateable s) {
        this.s = s;
    }


  public void stateOne() {
        System.out.println("State One CLOSE");
    }

    public void stateTwo() {
        System.out.println("State Two OPEN");
        s.setState(new StateThree(s));
    }

    public void stateThree() {
        System.out.println("State Three CLOSE");
    }

}
