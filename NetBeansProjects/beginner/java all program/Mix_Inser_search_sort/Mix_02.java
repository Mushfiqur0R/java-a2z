package Mix_Inser_search_sort;

import java.util.Scanner;

public class Mix_02 {
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
        //Partition
        if(low<j){
            Quicksort(ar,j,low);
        }
        if(high>i){
            Quicksort(ar,i,high);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = s.nextInt();
        int ar[] = new int[n + 1];
        System.out.println("Enter Array:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.println("" + ar[i]);
        }
        System.out.println("Enter the insertion index mumber:");
        int index = s.nextInt();
        System.out.println("Enter the insertion element:");
        int element = s.nextInt();
        for (int i = ar.length - 1; i > index; i--) {
            ar[i] = ar[i - 1];
        }
        ar[index] = element;
        System.out.println("After insertion:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("" + ar[i]);
        }
        //Quicksort
        System.out.println("After Quicksort:");
        Quicksort(ar,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(""+ar[i]);
        }
        
        // Binary Search
//        System.out.println("Enter the search item:");
//        int item=s.nextInt();
//        int hi=ar.length-1;
//        int li=0,mi; //li= lower index, hi=higher index
//        mi=(li+hi)/2;
//        while(li<=hi){
//            if(ar[mi]==item){
//                System.out.println("Item is "+mi+" position");
//                break;
//            }
//            else if(ar[mi]<item){
//                li=mi+1;
//            }
//            else{
//                hi=mi-1;
//            }
//            mi=(li+hi)/2;
//        }
       
    }
}
