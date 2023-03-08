
package beginner;
import java.util.Scanner;


public class Series2 {
    public static void main(String[] args) {
        
        double num,sum=0;
        System.out.print("Enter The Last Number:");
        Scanner input=new Scanner(System.in);
        num=input.nextDouble();
        
        for (double i = 1.5; i <= num; i=i+1) {
            sum+=i;
            System.out.println(i);
            
        }
        System.out.println("SUM="+sum);
        
        
    }
    
    
}
