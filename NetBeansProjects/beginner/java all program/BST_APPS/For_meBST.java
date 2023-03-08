
package BST_APPS;

import java.util.Scanner;
public class For_meBST {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer value of array:");
        int n=s.nextInt();
        System.out.println("Enter array:");
        int []ar=new int [n];
        for (int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int root=ar[0],left=ar[n],right=ar[n];
        if(left<root){
            System.out.println(""+left);
        }
        
        
        System.out.println("After binary search tree:");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("" + ar[i]);
            
        }
        System.out.println(""+ar[2]);
    }
    
}
