/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.adapter;

/**
 *
 * @author admin
 */
public class ChildB implements  B{

    public void iam() {
        System.out.println(this.getClass().getName());
    }
    

}
