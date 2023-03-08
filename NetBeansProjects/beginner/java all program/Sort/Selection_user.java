package Sort;

import java.util.Scanner;

public class Selection_user {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer value of array:");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int min, temp = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }
    }
}
