
package Different_Loop;
import java.util.Scanner;
public class Positive_integer {
    public static void main(String[] args) {
        int sum=0,i=1;
        Scanner sc=new Scanner(System.in);
        // Count start 0 to infinite...........
        System.out.println("Enter the positive number:");
        int n=sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
            System.out.println("Sum:"+sum);
        }
        if(n<0){
                System.out.println("Not Result");
            }
        
    }
}
