
package Sort;
import java.util.Scanner;

public class Insertation_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter integer value of array:");
        int n=s.nextInt();
        int []ar=new int [n];
        System.out.println("Enter Array:");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int temp,j;
        for(int i=1;i<n;i++){
            temp=ar[i];
            j=i;
            while(j>0 && ar[j-1]>temp){
                ar[j]=ar[j-1];
                j=j-1;
            }
            ar[j]=temp;
        }
        System.out.println("After Insertion Sort:");
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
    }
}
