
package Queue;

import java.util.Scanner;
public class Insert {
    
    public static void main(String[] args) {
        
         int a[]=new int [50];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=in.nextInt();
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
//        void undocall(){
//        for (int i = 0; i < size; i++) {
//            System.out.println("" + a[i]);
//        } 
//    }
        //Insertion
        System.out.println("\nEnter the element to be inserted:");
        int x=in.nextInt();
        System.out.println("Enter the index where you want to insert?");
        int pos=in.nextInt();
        for(int i=size;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=x;
        ++size;
        
        System.out.println("Array after insertion:");
        for(int i=0;i<size;i++){
            System.out.println(a[i]+ "");
        }
        
        //Deletion
        System.out.println("Enter the index where you want to delete?");
        int pos1=in.nextInt();
        for(int i=pos1;i<size+1;i++){
            a[i]=a[i+1];
        }
        //a[pos]=x;
        --size;
        
        System.out.println("Array after deletion:");
        for(int i=0;i<size;i++){
            System.out.println(a[i]+ "");
        }
        
        //Undo
        System.out.println("Do you want to undo your list? type'1'");
        int num=in.nextInt();
        if(num==1){
        System.out.println("After undo operation using in Array:");
        for (int i = 0; i < size; i++) {
            System.out.println("" + a[i]);
        } 
        }
      }
   
}
