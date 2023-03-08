
package Super_keyword;

class A{
    //int x=10;
//    void display(){
//        System.out.println("Display A class");
    A(){
        System.out.println("A is Super Constractor");
    }
}
class B extends A{
    //int x=5;
    //@Override
    //void display(){
        //System.out.println(super.x);
        //super.display();
        //System.out.println("Display B Class");
    B(){
        super();
        System.out.println("B is Super Constractor");
        }
}

public class Test08 {
    public static void main(String[] args) {
        B ob=new B();
        //ob.display();
        
    }
    
}
