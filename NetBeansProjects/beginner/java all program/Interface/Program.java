
package Interface;
interface program_name{
        String name= java;
        static void display(){
            System.out.println(" "+name);
        }
        
    }
public class Program implements program_name{
    public static void main(String[] args) {
        program_name.display();
       
    }
    
    
}
