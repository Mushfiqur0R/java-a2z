
package Sort;
import java.util.Scanner;

public class QS {
    static void Partition(int ar[],int low,int high){
        int mid=(low+high)/2;
        int i=low;
        int j=high;
        int pivot=ar[mid];
        while(i<=j){
            while(ar[i]<pivot){
                i++;
            }
            while(ar[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
        }
        //partiton
        if(low<j){
            Partition(ar,j,low);
        }
        if(high>i){
            Partition(ar,i,high);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=s.nextInt();
        int ar[]=new int [n];
        System.out.println("Enter Array:");
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        System.out.println("After Quick Sort:");
        Partition(ar,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(ar[i]+"");
        }
    }
}
