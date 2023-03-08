
package Search;
// Binary search
import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        int i,n,item;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer value of array:");
        n=s.nextInt();
        System.out.println("Enter the Array:");
        int []ar=new int[n+1];
        for(i=0;i<n;i++){
            ar[i]=s.nextInt();  
        }
        System.out.println("Array are:");
        for(i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
        System.out.println("Enter the Search item:");
        item=s.nextInt();
        int hi=n-1;
        int li=0,mi;
        mi=(li+hi)/2; //ii=lower index,mi=middle index,hi=high index
        while(li<=hi){
            if(ar[mi]==item){
                System.out.println("Item is at "+mi+" index position");
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
