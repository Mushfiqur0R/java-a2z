
package Method_Overriding;


public class Student extends Person {
    String vercity;
    
    @Override
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Vercity Name: "+vercity);
        System.out.println("");
    }
}
