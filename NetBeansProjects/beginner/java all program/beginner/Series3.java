
package beginner;
import java.util.Scanner;


public class Series3 {
    public static void main(String[] args) {
        
        int num,sum=0;
        System.out.print("Enter The Last Number:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        
        for (int i = 1; i <= num; i=i+1) {
            System.out.print(i+"x"+i+" ");
            sum+=i*i;
            
        }
        System.out.println("");
        System.out.println("SUM="+sum);
    }
    
}
