package Mix_Inser_search_sort;

import java.util.Scanner;

public class Mix_01 {
    static void Quicksort(int ar[],int low,int high){
        int i=low;
        int j=high;
        int mid=(low+high)/2;
        int pivot=ar[mid];
        while(i<=j){
            while(ar[i]<pivot){
                i++;
            }
            while(ar[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
        }
        // Partition
        if(low<j){
            Quicksort(ar,j,low);
        }
        if(high>i){
            Quicksort(ar,i,high);
        }
    }

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of Array:");
        n = p1.nextInt();

        System.out.println("Enter the Array:");
        int[] ar = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ar[i] = p1.nextInt();
        }

        System.out.println("Before Insertation Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i] + "");
        }
        System.out.println("Enter change Index position Number:");
        int index = p1.nextInt();
        System.out.println("Enter change position Element:");
        int element = p1.nextInt();
        System.out.println("After Insertion:");
        for (int i = ar.length - 1; i > index; i--) {
            ar[i] = ar[i - 1];
        }
        ar[index] = element;
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + "");
        }
        // quick sort
        System.out.println("After Quick Sort:");
        Quicksort(ar,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
        System.out.println("Enter Search item:");
        int item=p1.nextInt();
        int hi=ar.length-1;
        int li=0,mi;
        // hi= high index, li= low index
        mi=(li+hi)/2;
        while(li<=hi){
            if(ar[mi]==item){
                System.out.println("Item is "+mi+" index position");
                break;
            }
            else if(ar[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
    }
}
