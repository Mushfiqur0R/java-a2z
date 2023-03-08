package Sort;

import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer value of array:");
        int n = s.nextInt();
        System.out.println("Enter Array:");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int flag = 0, temp;
//        System.out.println("Before bubble sort:");
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
//            System.out.println("" + ar[i]);
        }
        System.out.println("After bubble sort:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("" + ar[i]);
        }

    }
}
