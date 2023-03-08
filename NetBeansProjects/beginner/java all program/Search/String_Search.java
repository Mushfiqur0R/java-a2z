
package Search;
import java.util.Scanner;

public class String_Search {
    public static void main(String[] args) {
        int n;
        String item;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Integer value of Array:");
        n = s.nextInt();
        System.out.println("Enter the Array value:");
        String[] ar = new String[n + 1];
        for (int i = 0; i < n; i++) {
            ar[i] = s.next();
        }
        System.out.println("Array are:");
        for (int i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }
        int temp=0;
        System.out.println("Enter the Search String item:");
        item = s.next();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(item)) {
                System.out.println("Elements is present at " + i + " index position");
                temp=temp+1;
            } 
        }
        if(temp==0){
            System.out.println("Not Defined");
        }
    }
}
