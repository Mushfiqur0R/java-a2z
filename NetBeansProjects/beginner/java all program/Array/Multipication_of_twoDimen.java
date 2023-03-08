
package Array;
import java.util.Scanner;

public class Multipication_of_twoDimen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int ar[][]=new int [row][col];
        int mr[][]=new int [row][col];
        int cr[][]=new int [row][col];
        System.out.println("Enter 1st Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter 2nd Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mr[i][j]=sc.nextInt();
            }
        }
       
        System.out.println("Multipication of two MAtrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 cr[i][j]=0;
                 for(int k=0;k<row;row++){
                     cr[i][j]+=ar[i][k]*mr[k][j];
                 }
                 
                System.out.print("    "+cr[i][j]);
            }
            
            //System.out.println();
        }
        
        
        
    }
}
