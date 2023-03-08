
package Sort;


public class Heapsort {
    public static void main(String[] args) {
        int []ar={22,13,17,11,10,14,12};
        Heapsort hs=new Heapsort();
        hs.sort(ar);
        hs.printarray(ar);
        
    }
    
    void sort(int []ar){
        int leng=ar.length;
        for(int i=leng/2-1;i>=0;i--){
            heapify(ar,leng,i);
        }
        for(int i=leng-1;i>0;i--){
            int temp=ar[0];
            ar[0]=ar[i];
            ar[i]=temp;
            heapify(ar,i,0);
        }
    }
    
    void heapify(int []ar,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        
        if(left<n && ar[left]>ar[largest]){
        largest =left;
    }
        if(right<n && ar[right]>ar[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=ar[i];
            ar[i]=ar[largest];
            ar[largest]=temp;
            heapify(ar,n,largest);
        }
        
    }
    
    void printarray(int []ar){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+"");
        }
    }
}
