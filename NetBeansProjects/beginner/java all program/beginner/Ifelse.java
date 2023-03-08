package beginner;
import java.util.Scanner;


public class Ifelse {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter Any Intiger:");
        Scanner a= new Scanner(System.in);
        num=a.nextInt();
        
        if(num>0){
            System.out.println("Positive Number");
        }
        else if (num<0){
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Equal to zero");
        }
    }
    
}
