
package Sort;


public class MergeSort {
    int []ar;     // Instant Variable.......
    int []tempMergeAr;
    int length;
    public static void main(String[] args) {
        int []arInput={48,36,13,52,14,94,21};
        MergeSort ms=new MergeSort();
        ms.sort(arInput);
        
        // For output.............
        for(int i:arInput){
            System.out.println(i+"");
        }
    }
    public void sort(int []arInput){
        // pasing intant variable from sort mathod.........
        this.ar=arInput;
        this.length=arInput.length;
        this.tempMergeAr=new int[length]; //create temp array with input array size
        this.devidedArray(0,length-1);
    }
    public void devidedArray(int lowerIndex,int higherIndex){ //Recursion mathod.........
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2; 
            devidedArray(lowerIndex,middle);  //it will sort for left side array.........
            devidedArray(middle+1,higherIndex);  //it will sort for right side array........
            mergeArray(lowerIndex,middle,higherIndex);
        }
        
    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i=lowerIndex;i<=higherIndex;i++){
            tempMergeAr[i]=ar[i];  //put array veriable in temMergeAr veriable.............
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        
        while(i<=middle && j<=higherIndex){
            if(tempMergeAr[i]<=tempMergeAr[j]){
                ar[k]=tempMergeAr[i];
                i++;
            }
            else{
                ar[k]=tempMergeAr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            ar[k]=tempMergeAr[i];
            k++;
            i++;
        }
    }
}