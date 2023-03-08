
package Interface03;
interface Animale{
    public abstract void  eat();   
}
class Dog implements Animale {
    @Override
    public void eat(){
        System.out.println("I eat meat");
    }
}
class Cat implements Animale{
    @Override
    public void eat(){
        System.out.println("I eat fish");
    }
}
public class Dog_Cat {
    public static void main(String[] args) {
        Animale a1;
        a1=new Dog();
        a1.eat();
        a1=new Cat();
        a1.eat();
    }
    
}
