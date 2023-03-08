package Search;

import java.util.Scanner;

public class Bubble_s2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer value of array:");
        int n = s.nextInt();
        System.out.println("Enter Array:");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.println("After Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }

    }
}
