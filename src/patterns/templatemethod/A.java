/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.templatemethod;

/**
 *
 * @author admin
 */
public abstract class A {


    public final void shareAlgorytm(){
        this.action1();
        this.templMethod();   // <-- templ method must be redeclare in subclasses
        if(this.interceptor()){
            this.action2();
        }

    }

    public void action1(){
        System.out.println("Start");
    }
    public void action2(){
        System.out.println("End");
    }

    public Boolean interceptor(){ // <-- метод перехватчик, переопределение метода может влиять на алгоритм программы
                                  // часто бывает что он ничего не делает
        return true;
    }
    public abstract void templMethod();

}
