/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.decorator;

/**
 *
 * @author admin
 */
public class MinusSum implements Base {

    protected Base b;

    public MinusSum(Base b) {
        this.b = b;
    }

    public Float getCost() {
        return b.getCost()-0.5F;
    }




}
