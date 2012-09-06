/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.adapter;

/**
 *
 * @author admin
 */
public class BtoAAdapter implements A {

    protected B b;

    public BtoAAdapter(B b) {
        this.b = b;
    }

    public void mynameis() {
        b.iam();
    }


    

}
