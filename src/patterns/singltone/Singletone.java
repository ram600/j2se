/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns.singltone;

/**
 *
 * @author admin
 */
public class Singletone {

    private static Singletone s;


    public static Singletone getInstanceSimple(){
        
        if(Singletone.s == null){
            Singletone.s = new Singletone();
        }

        return Singletone.s;
    }
/**/

    /**
     @body Создаем так если есть много потоков,чтобы сюда мог попасть в одно врмея только один поток, иначе
    //синг тон пересоздастся , если обратятся сюда в одно  тоже время
    //НО , синхронизации много жрет, по сути тут она нужна единожды для создания объекта, далее
    //условие будет проверять и отдавать тот же объект всем
    //если синглтон часто используется большая нагрузка, то так лучше не делать
    // Если время на создание синлтона не существенно, то луче создать его прямо в парметре
    //  private static Singletone s = new Singltone(); JVM создаст его сразу, до обращения к классу потоков
    //
    // НО это не вариант если создание синглтона затратно, ТОГДА СМОТРИ еще ниже синхронизацию в контексте
     *
     */

    /**
     *
     * @return aaaa
     * @
     */
    public static synchronized  Singletone getInstanceForSynchronize(){

        if(Singletone.s == null){
            Singletone.s = new Singletone();
        }
         return Singletone.s;

    }

    //Если создание инстанса затратное дело,тогда используем синхронизацию единожды!!
    //т.к она менее затратна,в отличие от того, если бы мы прописали синхронайзд перед методом!
    // но тогда volatile пишем перед параметром!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static   Singletone getInstanceForSynchronizeInContext(){

        //проверяем,если объекта еще нет юзаем синхронизацию
        if(Singletone.s == null){
            synchronized(Singletone.class){
                //повторяем проверку!!!!, за тот случай если другой поток уже чуть ране вошел сюда и создал экземпляр Singlton!!!!
                //если проверки не буедт после того как одн войдет и создаст,войдет другой и создаст опять!
                if(Singletone.s == null){
                    Singletone.s = new Singletone();
                }
            }
        }

        return Singletone.s;

    }

}
