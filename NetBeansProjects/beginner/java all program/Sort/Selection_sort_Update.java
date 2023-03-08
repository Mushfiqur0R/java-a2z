
package Sort;

public class Selection_sort_Update {
    void selection_sort(int ar[],int n){
       for(int i=0;i<n-1;i++){
           int min=i;
           for(int j=i+1;j<n;j++){
               if(ar[j]<ar[min]){
                   min=j;
               }
               int temp=0;
               if(min!=i){
                   temp=ar[i];
                   ar[i]=ar[min];
                   ar[min]=temp;
               }
           }
       } 
    }
    public static void main(String[] args) {
        
    }
}
