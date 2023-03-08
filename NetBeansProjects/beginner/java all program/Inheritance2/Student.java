
package Inheritance2;


public class Student extends Person {
    String degree;
    
    void display2(){
        display1();
        System.out.println("Degree: "+degree);
        System.out.println("");
    }
            
}
