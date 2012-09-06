/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.absractfactory;

/**
 *
 * @author admin
 */
public class FactoryProductOld implements ProductAbsractFactory{

    public ProductA createProductA() {
        return new OldProductA();
    }

    public ProductB createProductB() {
        return new OldProductB();
    }

}
