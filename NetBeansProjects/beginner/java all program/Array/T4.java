
package Array;
// User Input Index Number
import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
        Scanner p1=new Scanner(System.in);
        System.out.println("Enter The Index Number:");
        int index=p1.nextInt();
        System.out.println("Enter The Element Number:");
        int element=p1.nextInt();
        int[]ar={10,20,30,40,50,60,70,80};
        int i;
        
        if(index>=0 && index<8){
            System.out.println("Insertion:");
            for(i=ar.length-1; i>index; i--){
                ar[i]=ar[i-1];
            }
            ar[index]=element;
            for(i=0; i<ar.length; i++){
                System.out.println(ar[i]+"");
            }
        }
        else{
            System.out.println("Not Difined");
        }
    }
}
