
package Mix_Inser_search_sort;
import java.util.Scanner;

public class Quick_Binary {
    static void Quicksort(int ar[],int low,int high){
        int i=low;
        int j=high;
        int mid=(low+high)/2;
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
        //partition
        if(low<j){
            Quicksort(ar,low,j);
        }
        if(high>i){
            Quicksort(ar,high,i);
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
        Quicksort(ar,0,n-1);
        System.out.println("After Quicksort:");
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
        // Binary Search
        
        System.out.println("Enter Search item:");
        int item=s.nextInt();
        int hi=ar.length-1;
        int li=0,mi;
        mi=(li+hi)/2;
        while(li<=hi){
            if(ar[mi]==item){
                System.out.println("Item is "+mi+" Index position");
                break;
            }
            else if(ar[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
    }
}
