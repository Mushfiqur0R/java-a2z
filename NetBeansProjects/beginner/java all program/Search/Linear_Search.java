package Search;
//Linear Search
import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
        int n, i, item;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        n = s.nextInt();
        System.out.println("Enter Array :");
        int[] ar = new int[n + 1];
        for (i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Array are:");
        for (i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }
        int temp=0;
        System.out.println("Enter the Search item:");
        item = s.nextInt();
        for (i = 0; i < ar.length; i++) {
            if (ar[i] == item) {
                System.out.println("Elements is present at " + i + " index position");
                temp=temp+1;
            } 
        }
        if(temp==0){
            System.out.println("Not Defined");
        }
    }
}
