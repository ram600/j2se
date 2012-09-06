/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.state;

import sun.applet.Main;

/**
 *
 * @author admin
 */
public class StateOne implements Base{


    protected Stateable s;

    public StateOne(Stateable s) {
        this.s = s;
    }




    public void stateOne() {
        System.out.println("State One OPEN");
        s.setState(new StateTwo(s));
        
    }

    public void stateTwo() {
        System.out.println("State Two CLOSE");
     }

    public void stateThree() {
        System.out.println("State Three CLOSE");
     }

}
