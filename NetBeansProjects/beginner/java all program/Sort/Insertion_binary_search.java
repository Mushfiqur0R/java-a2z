package Sort;
import java.util.Scanner;
public class Insertion_binary_search {

    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
  
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
  
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
  
        Insertion_binary_search ob = new Insertion_binary_search();
        ob.sort(arr);
  
        printArray(arr);
        int n = arr.length;
        
        //////Binary Search....................
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Search Item: ");
        int item=sc.nextInt();
         int hi=n-1;
        int li=0,mi;
        mi=(li+hi)/2; //ii=lower index,mi=middle index,hi=high index
        while(li<=hi){
            if(arr[mi]==item){
                System.out.println("Item is at "+mi+" index position");
                break;
            }
            else if(arr[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
    }
}    

