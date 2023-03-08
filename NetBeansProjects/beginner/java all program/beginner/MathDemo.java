
package beginner;
import java.util.Scanner;


public class MathDemo {
    public static void main(String[] args) {
        
        int num1,num2,max,min;
        System.out.print("Enter 1ST number:");
        Scanner input=new Scanner(System.in);
        num1=input.nextInt();
        System.out.print("Enter 2ND number:");
        num2=input.nextInt();
        
        max=Math.max(num1,num2);
        System.out.println("MAX="+max);
        min=Math.min(num1,num2);
        System.out.println("MIN="+min);
        double power=Math.pow(num1,num2);
        System.out.println("Num1 TO The Power Num2="+power);
        int round=Math.round(8.88f);
        System.out.println("Round of 8.88="+round);
        
    }
    
}
