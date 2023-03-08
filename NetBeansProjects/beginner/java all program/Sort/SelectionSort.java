package Sort;
import java.util.Scanner;
public class SelectionSort {

    void sort(int ar[]) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            int min_element = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[min_element]) {
                    min_element = j;
                }
            }
            int temp = ar[min_element];
            ar[min_element] = ar[i];
            ar[i] = temp;
        }
    }

    void printarrayay(int ar[]) {
        int n = ar.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter Array: ");
        int ar[]=new int [n];
        
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Before sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
        ob.sort(ar);
        System.out.println("After sorted array: ");
        ob.printarrayay(ar);
    }
}
