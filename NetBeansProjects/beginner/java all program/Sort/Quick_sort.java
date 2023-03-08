package Sort;

import java.util.Scanner;

public class Quick_sort {

    static void QuickSort(int ar[], int low, int high) {
        int mid = (low + high) / 2;
        int i = low;
        int j = high;
        int pivot = ar[mid];
        while (i <= j) {
            while (ar[i] < pivot) {
                i++;
            }
            while (ar[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j--;
            }
        }
        // Partition
        if (low < j) {
            QuickSort(ar, low, j);
        }
        if (high > i) {
            QuickSort(ar, high, i);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = s.nextInt();
        System.out.println("Enter Array:");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("After Quick Sort:");
        QuickSort(ar, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i] + "");
        }
    }
}
