/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.absractfactory;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        FactoryProductNew fpn = new FactoryProductNew();
        FactoryProductOld fpo = new FactoryProductOld();

        printProduct(fpo);
        printProduct(fpn);
        




    }


    public static void printProduct(ProductAbsractFactory paf){
            ProductA pa = paf.createProductA();
            ProductB pb = paf.createProductB();

            pa.iamA();
            pb.iamB();
    }

}
