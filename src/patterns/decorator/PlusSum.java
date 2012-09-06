/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.decorator;

/**
 *
 * @author admin
 */
public class PlusSum implements Base{

    protected Base b;
    public PlusSum(Base b) {
        this.b = b;
    }

    public Float getCost(){
        return b.getCost() + 1.0F;
    }




}
