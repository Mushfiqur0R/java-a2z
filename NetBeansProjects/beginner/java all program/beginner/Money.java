
package beginner;
import java.util.Scanner:

public class Money {
    public static void main(String[] args) {
        
        double num,over_time;
        System.out.println("Payment of number of hour:");
        Scanner input= new Scanner (System.in);
        num= input.nextInt();
        over_time= 1.5*num;
        System.out.println("Over Time Payment="+over_time);
        System.out.println("Hourly Payment="+num);
        
        
        
    }
    
}
