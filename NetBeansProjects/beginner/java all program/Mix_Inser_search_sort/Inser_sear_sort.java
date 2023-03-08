
package Mix_Inser_search_sort;
import java.util.Scanner;

public class Inser_sear_sort {
    public static void main(String[] args) {
        int capacity=100;
        int ar[]=new int [100];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size=s.nextInt();
        System.out.println("Enter Array;");
        for(int i=0;i<size;i++){
            ar[i]=s.nextInt();
        }
        System.out.println("Enter Insertion index position:");
        int position=s.nextInt();
        System.out.println("Enter change index position element:");
        int element=s.nextInt();
        for(int i=size;i>position;i--){
            ar[i]=ar[i-1];
        }
        ar[position]=element;
        ++size;
        System.out.println("After insertion:");
        for(int i=0;i<size;i++){
            System.out.println(ar[i]+"");
        }
        System.out.println("Enter the search item:");
        int item=s.nextInt();
        int hi=size;
        int li=0,mid;
       // hi=high index, li=low index
       mid=(li+hi)/2;
       while(li<=hi){
           if(ar[mid]==item){
               System.out.println("Item is "+mid+" index position");
               break;
           }
           else if(ar[mid]<item){
               li=mid+1;
           }
           else{
               hi=mid-1;
           }
           mid=(li+hi)/2;
       }
    }
}
