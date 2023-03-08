
package Array;
// User Input position insert
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner p1= new Scanner(System.in);
        System.out.println("Enter Position Number:");
        int pos=p1.nextInt();
        
        Scanner p2=new Scanner(System.in);
        System.out.println("Enter The Element Number:");
        int element=p2.nextInt();
        
        if (pos<9 && pos>0){
            System.out.println("Insertation:");
            int[] ar={10,20,30,40,50,60,70,80};
        int i;
        for(i=ar.length-1; i>pos-1; i--){
            ar[i]=ar[i-1];
        }
        ar[pos-1]=element;
        for(i=0; i<ar.length; i++){
            System.out.println(ar[i]+"");
        }
//            System.out.println(+ar[pos]);
        }
        else{
            System.out.println("Not Difined");
        }
      
    }
}
