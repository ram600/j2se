/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.singltone;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Когда один поток
        Singletone.getInstanceSimple();
        //Когда несоклько потоков, но создание Singltone не затратно
        //ЛУчше создать инстансе прямо в параметре
        Singletone.getInstanceForSynchronize();

        //Когда создание объекта очень затратно,доступ к нему частый лучше сделать синхронайзд в контексте,
        //тогда он вызовется только один раз
        Singletone.getInstanceForSynchronizeInContext();
        
    }

}
