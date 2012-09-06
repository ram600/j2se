/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.adapter;

/**
 *
 * @author admin
 */
public class ChildA  implements A{

    public void mynameis() {
        System.out.println(this.getClass().getName());
    }

}
