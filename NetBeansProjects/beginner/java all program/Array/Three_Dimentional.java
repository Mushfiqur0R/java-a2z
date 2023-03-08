
package Array;
import java.util.Scanner;
public class Three_Dimentional {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int o=sc.nextInt();
        int ar[][][]=new int [m][n][o];
        System.out.println("Enter 3D Array Element:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<o;k++){
                    ar[i][j][k]=sc.nextInt();
                }
                //ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("3d Array is: ");
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                for(int k=0;k<o;k++){
//                    System.out.print("   "+ar[i][j][k]);
//                }
//            }

////// Hans For ..................
        for(int i[][]:ar){
            for(int j[]:i){
                for(int k:j){
                    System.out.print("   "+k);
                }
            }
            System.out.println();
        }
    }
}
