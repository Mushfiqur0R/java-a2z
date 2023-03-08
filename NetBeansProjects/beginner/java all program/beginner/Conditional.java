
package beginner;
import java.util.Scanner;


public class Conditional {
    public static void main(String[] args) {
        
        int num1,num2,learge,small;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter 1ST Number:");
        num1=input.nextInt();
        System.out.print("Enter 2ND Number:");
        num2=input.nextInt();
        learge=(num1>num2)? num1: num2;
        System.out.println(learge+ "\tis Learge Number");
        small=(num1<num2)? num1 : num2;
        System.out.println(small+ "\tis Small Number");
       
    }
    
}
