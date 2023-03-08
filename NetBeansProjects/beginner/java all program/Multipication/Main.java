
package Multipication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Base of Matrix:");
        Scanner input=new Scanner (System.in);
        n=input.nextInt();
        int m1[][]=new int[n][n];
        int m2[][]=new int[n][n];
        int m[][]=new int[n][n]; 
        
        System.out.println("Enter the 1st value of matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            //m[i][j]=0;
            
            m[i][j]=input.nextInt();        
            
            }
        }
        System.out.println("Enter the 2nd value of matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
           //m[i][j]=0;
            
            m[i][j]=input.nextInt();        
            
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            //m[i][j]=0;
            for(int k=0;k<3;k++)
            {
            m[i][j] = m[i][j] + m1[i][k] * m2[k][j];        
            }
            //System.out.print(m[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.println("Multipication of Matrix:");
        for (int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        input.close();
        
//        int m1[][]={{1,2,3},{3,4,5},{6,7,8}};
//        int m2[][]={{3,2,1},{5,4,3},{8,7,6}};
        
//        System.out.println("Enter the 1st matrix:");
//        Scanner input= new Scanner(System.in);
//        m1[][]=input.nextInt();
//        
//        System.out.println("Enter the 2nd matrix:");
//        //Scanner input= new Scanner(System.in);
//        m2[][]=input.nextInt();
//        if (m1!=m2){
//            System.out.println("Multiplication Not Possible");
//            return;
//        }

        //3 rows and 3 columns
        
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//            m[i][j]=0;
//            for(int k=0;k<3;k++)
//            {
//            m[i][j]+=m1[i][k]*m2[k][j];        
//            }
//
//            System.out.print(m[i][j]+" ");
//            }
//
//        System.out.println();
//        }
    }
}
