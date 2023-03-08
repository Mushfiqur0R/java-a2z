// Question 4

package Multiple_Inheritance_interface;

interface A{
    public abstract void display();
}
interface B{
    public abstract void display();
}
class C implements A,B{
    @Override
    public void display(){
        System.out.println("I am from c"); 
    }
}
public class A_B_C {
    public static void main(String[] args) {
        C ob= new C();
        ob.display();
    }
}
