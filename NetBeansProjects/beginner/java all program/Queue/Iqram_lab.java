package Queue;

import java.util.Scanner;

public class Iqram_lab {

    public static void main(String[] args) {
         int arr[]=new int [100];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s=in.nextInt();
        System.out.println("Enter array element:");
        for(int i=0;i<s;i++){
            arr[i]=in.nextInt();
        }

        //Insertion      
        System.out.println("\nEnter the element to be inserted:");
        int x=in.nextInt();
        System.out.println("Enter the index where you want to insert?");
        int pos=in.nextInt();
        for(int i=s;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=x;
        ++s;
        
        System.out.println("Array after insertion:");
        for(int i=0;i<s;i++){
            System.out.println(arr[i]+ "");
        }
        
        //Deletion
        System.out.println("Enter the index where you want to delete?");
        int pos1=in.nextInt();
        for(int i=pos1;i<s+1;i++){
            arr[i]=arr[i+1];
        }
        //a[pos]=x;
        --s;
        
        System.out.println("Array after deletion:");
        for(int i=0;i<s;i++){
            System.out.println(arr[i]+ "");
        }
        
        //Undo
        System.out.println("Do you want to undo your list? type'1'");
        int num=in.nextInt();
        if(num==1){
        System.out.println("After undo operation using in Array:");
        for (int i = 0; i < s; i++) {
            System.out.println("" + arr[i]);
        } 
        }
    }
}
