/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.facade;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //инскапсулирует сложную систему, выдавая более простой интерфейс для клиента.
        ABFacade fac = new ABFacade(new A(), new B());
        System.out.println(fac.getNameAAndB());
    }

}
