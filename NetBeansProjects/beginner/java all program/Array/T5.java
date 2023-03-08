package Array;

import java.util.Scanner;

public class T5 {

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of Array:");
        n = p1.nextInt();
        System.out.println("Enter change Index position Number:");
        int index = p1.nextInt();
        System.out.println("Enter change position Element:");
        int element = p1.nextInt();
        System.out.println("Enter the Array:");

        if (index >= 0 && index < n + 1) {

            int[] ar = new int[n + 1];
            for (int i = 0; i < n; i++) {
                ar[i] = p1.nextInt();
            }
            System.out.println("Before Insertation Array:");
            for (int i = 0; i < n; i++) {
                System.out.println(ar[i] + "");
            }
            System.out.println("After Insertaion Array:");
            for (int i = ar.length - 1; i > index; i--) {
                ar[i] = ar[i - 1];
            }
            ar[index] = element;
            for (int i = 0; i < ar.length; i++) {
                System.out.println(ar[i] + "");
            }
        } else {
            System.out.println("Not Defined");
        }

    }
}
