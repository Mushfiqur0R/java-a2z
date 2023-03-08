
package Sort;
//import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter integer value of array:");
//        int n=s.nextInt();
       int []ar= {20,45,100,19,5,63};
//        System.out.println("Enter Araay:");
        int min,temp=0;
        for(int i=0;i<ar.length;i++){
//            ar[i]=s.nextInt();
            min=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min]){
                    min=j;
                }
            }
            temp=ar[i];
            ar[i]=ar[min];
            ar[min]=temp;
        }
        System.out.println("After selection sort:");
        for(int i=0;i<ar.length;i++){
            System.out.println(""+ar[i]);
        }
    }
}
