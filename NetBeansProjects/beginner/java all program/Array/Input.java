
package Array;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter Array Element:");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
    }
    
}
