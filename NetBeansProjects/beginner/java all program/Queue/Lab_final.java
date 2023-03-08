
package Queue;
import java.io.*; 
import java.lang.*;
import java.util.Scanner;
import java.util.*; 

public class Lab_final {
    public static int[] addX(int n, int arr[], int x) 
   { 
       int i; 
   
       // create a new array of size n+1 
       int newarr[] = new int[n + 1]; 
   
       // insert the elements from 
       // the old array into the new array 
       // insert all elements till n 
       // then insert x at n+1 
       for (i = 0; i < n; i++) 
           newarr[i] = arr[i]; 
   
       newarr[n] = x; 
   
       return newarr; 
   } 
   
   // Driver code 
   public static void main(String[] args) 
   { 
   
       int n = 10; 
       int i; 
   
       // initial array of size 10 
       int arr[] 
           = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
   
       // print the original array 
       System.out.println("Initial Array:\n"
                          + Arrays.toString(arr)); 
   
       // element to be added 
       System.out.println("Enter your insert element:");
       Scanner sc=new Scanner(System.in);
       int x =sc.nextInt();
   
       // call the method to add x in arr 
       arr = addX(n, arr, x); 
   
       // print the updated array 
       System.out.println("\nArray with " + x 
                          + " added:\n"
                          + Arrays.toString(arr)); 
       
               //Deletion
        System.out.println("Enter the index where you want to delete?");
        int pos1=sc.nextInt();
        for(i=pos1;i<n+1;i++){
            arr[i]=arr[i+1];
        }
        //a[pos]=x;
        --n;
        
        System.out.println("Array after deletion:");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+ "");
        }
       
   } 
}
