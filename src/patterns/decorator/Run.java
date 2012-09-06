/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.decorator;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Раюотает прозрачно,если нужно добавить дополнительные нюансы не изменяя кода , то тчо надо
        /// не подойдет , если в коде проверяется четкий тип переданного класса

        A a = new A();
        //добавляем декоратор
        PlusSum ps = new PlusSum(a);
        //так как декоратор прозрачен, то есть тот же интерфейс,что и у А
        //упаковываем в еще один декоратор
        //и так можно до бескокнечности
        MinusSum ms = new MinusSum(ps);

        Run.getCost(ms);
        
    }

    //!!!Получает все что касается интерфейса BASE, если бы был конкретный класс A , то декоратор не подошел бы
    public static void getCost(Base b){
        System.out.println(b.getCost());
    }

}
