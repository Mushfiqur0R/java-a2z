
package Polymorphism_runtime;

class Son extends Father{
    @Override
    void display(){
        System.out.println("I am Son");
    }
}
public class Test13 {
    public static void main(String[] args) {
        Grandfather f1=new Grandfather();
        f1.display();
        f1=new Father();
        f1.display();
        f1=new Son();
        f1.display();
    }
}
