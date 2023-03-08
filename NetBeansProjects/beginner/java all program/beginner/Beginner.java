package beginner;
import java.util.Scanner;
    
public class Beginner {
    public static void main(String[] args) {
            int num1,num2,sum;
            System.out.print("Enter 1st Number:");
            Scanner a=new Scanner(System.in);
            num1=a.nextInt();
            System.out.print("Enter 2nd Number:");
            num2=a.nextInt();
            sum=num1+num2;
            System.out.println("Sum="+sum);
    }
   
}
