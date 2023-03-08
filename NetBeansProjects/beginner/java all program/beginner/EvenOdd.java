

package beginner;
import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number:");
        Scanner a= new Scanner(System.in);
        num= a.nextInt();
        
        if (num%2==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    
}
