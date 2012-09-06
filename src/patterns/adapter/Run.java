/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.adapter;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new ChildA();
        Run.whoareyou(a);

        //хотим показать кто он, но интерфейс не подходит..
        B b = new ChildB();
        //тут на помощь приходит адаптер
        //который инкапсулирует объект - компановка, и реализует нужный интерфейс!!!
        //то есть становится прозрачным доя старого кода!!
        A adapter = new BtoAAdapter(b);
        Run.whoareyou(adapter);
    }

    public static void whoareyou(A a){
        a.mynameis();
    }

}
