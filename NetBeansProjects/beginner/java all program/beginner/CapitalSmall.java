
package beginner;
import java.util.Scanner;


public class CapitalSmall {
    public static void main(String[] args) {
        
        System.out.print("Enter a Word:");
        char ch;
        Scanner a= new Scanner(System.in);
        ch= a.next().charAt(0);
        
        if (ch>='a' && ch<='z'){
            System.out.println("Small Letter");
            
        }
        else if (ch>='A' && ch<='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a letter");
        }
            
    }
    
}
