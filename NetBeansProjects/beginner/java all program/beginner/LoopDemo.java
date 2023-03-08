
package beginner;
import java.util.Scanner;


public class LoopDemo {
    public static void main(String[] args) {
        
        int sum=0,a,b;
        System.out.print("Enter The 1ST Number of range of Sum:");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.print("Enter The 2ND Number of range of Sum:");
        b=input.nextInt();
        
        for (int i = a; i <=b; i++) {
            if(i%2==0){
                sum+=i;
                System.out.println("Num="+i);
            }
            
            }
        System.out.println("SUM="+sum);
        
    }
    
}
