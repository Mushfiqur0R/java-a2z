package beginner;
import java.util.Scanner;


public class DigitSpalling {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        char ch;
        Scanner a = new Scanner(System.in);
        ch= a.next().charAt(0);
        
        switch(ch){
            case a:
                System.out.println("a");
                break;
            case b:
                System.out.println("b");
                break;    
            case c:
                System.out.println("c");
                break;
            case d:
                System.out.println("d");
                break; 
            case e:
                System.out.println("e");
                break;
                
            default:
                System.out.println("Not in a,b,c,d & e");
        }
    }
    
}
