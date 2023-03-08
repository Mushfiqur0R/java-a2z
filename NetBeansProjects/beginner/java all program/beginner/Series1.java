
package beginner;

import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
        double n,sum=0;
        System.out.print("Enter The Last Number:");
        Scanner input=new Scanner(System.in);
        n=input.nextDouble();
        
        for (double i = 1.5; i <= n; i++) {
            //System.out.print(i+" ");
            sum=+i;        
        }
        //System.out.println("");
        System.out.println("SUM="+sum);
        
        
        
    }
    
}
