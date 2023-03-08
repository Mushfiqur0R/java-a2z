
package Array;
import java.util.Scanner;

public class Two_Dimention {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int ar[][]=new int [row][col];
        System.out.println("Enter 2D Array Element:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ar[i][j]=sc.nextInt();
            }
            //ar[i][i]=sc.nextInt();
        }
        //Enhanced Loop..............
        System.out.println("2d Array is: ");
        for(int i[]:ar){
            for(int j:i){
                System.out.print("    "+j);
            }
            System.out.println();
        }
    }
}
