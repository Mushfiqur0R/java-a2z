
package Interface2;
interface Program_Name{
    
    void display();
}

class A implements Program_Name{
        @Override
        public void display(){
        String name="Java";
        System.out.println(""+name);
       }
  
}
public class In1 {
    public static void main(String[] args) {
        A ob= new A();
        
        ob.display(); 
    }
    
}
