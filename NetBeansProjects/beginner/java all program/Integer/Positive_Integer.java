
package Integer;
import java.util.Scanner;

public class Positive_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Integer number:");
        int n1=sc.nextInt();
        //System.out.println("Enter 2nd Integer number: ");
        int n2=sc.nextInt();
        //System.out.println("Enter 3rd Integer number: ");
        int n3=sc.nextInt();
        int sum=0;
        if(n1>=0){
            sum+=n1;
        }
        else{
            sum=sum;
        }
        if(n2>=0){
            sum+=n2;
        }
        else{
            sum=sum;
        }
        if(n3>=0){
            sum+=n3;
        }
        else{
            sum=sum;
        }
        System.out.println("Sum: "+sum);
        
    }
}
