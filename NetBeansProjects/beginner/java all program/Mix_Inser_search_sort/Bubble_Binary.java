package Mix_Inser_search_sort;

import java.util.Scanner;

public class Bubble_Binary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int temp, flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        System.out.println("After bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }
        // binary search
        System.out.println("Enter Search item:");
        int item = s.nextInt();
        int hi = n - 1;
        int li = 0, mi;
        mi = (li + hi) / 2;
        while (li <= hi) {
            if (ar[mi] == item) {
                System.out.println("Item is " + mi + "index position");
                break;
            } else if (ar[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
    }
}
