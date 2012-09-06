/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.state;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Инкапсулирует варианты состояний объекта,причем они могут решать в какое состояние он перейдет дальше
        // к примеру если один канал открыт,остальные закрыты,но при этом активируя один основной мы переводи объект в другое состояние и т.д
        //помогает избежать кучи блоков условий и делает код более структурированным

        A a = new A();
        //по дефолту открываем первый шлюз, далее объект переводится в другое состояние
        //где можно открыть шлюз два,но нельяз остальные и т.д
        a.stateOne();
        //на втором состоянии шлюз один и два закрыты
        a.stateOne();
        a.stateThree();

        //открываем два, переводим объект уже в третее состояние? где все закрыто, кроме первого и Т.Д
        a.stateTwo();
        a.stateTwo();
        a.stateThree();
        a.stateOne();

    }

}
