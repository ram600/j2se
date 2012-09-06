/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.absractfactory;

/**
 *
 * @author admin
 */
public class FactoryProductNew implements ProductAbsractFactory {

    public ProductA createProductA() {
        return new NewProductA();
    }

    public ProductB createProductB() {
        return new NewProductB();
    }



}
