/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.observer;



/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //тот кого слушают
      IAmObservable obl = new IAmObservable();

      //тот кто слушает
      //слушатели
      Observer o = new IamObserver(obl);
      Observer o1 = new IamObserver(obl);

      obl.a = "Fuck";
      obl.b = "You";
      obl.setChanged();
      obl.inform();
      
    }

}
