
package Abstraction;
abstract class Mobile{
    void call(){
        System.out.println("This is Mr.MR");
    }
    abstract void send();
}
class Male extends Mobile{
    @Override
     void send(){
         System.out.println("Men: Hey, What's up!");
     }   
}
class Female extends Male{
    @Override
    void send(){
        System.out.println("Women: Yea, well.So, what's going on?");
    }
}
public class Message {
    public static void main(String[] args) {
        Mobile s1;
        s1=new Male();
        s1.call();
        s1.send();
        s1=new Female();
        s1.send();
    }
}
