
package Sort;


public class Quick_s {
    public static void main(String[] args) {
        int ar[]={15,9,7,13,12,16,4,18,11};
        int len=ar.length;
        
    }
    int partition(int[]ar,int low,int high){
        int pivot=ar[(low+high)/2];
        while(low<=high){
            while(low<pivot){
                low++;
            }
            while(high>pivot){
                high--;
            }
            if(low<=high){
                int temp=ar[low];
                ar[low]=ar[high];
                ar[high]=temp;
                
                low++;
                high--;
            }
        }
        return low;
    }
}
