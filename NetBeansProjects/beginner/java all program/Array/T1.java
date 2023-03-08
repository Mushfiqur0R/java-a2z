
package Array;
//Position Insert Array
public class T1 {
    public static void main(String[] args) {
        int[] ar={10,20,30,40,50};
        int pos=3;
        //int i;
        int element=100;
        
        for(int i=ar.length-1; i>pos-1; i--){
            ar[i]=ar[i-1];
        }
        ar[pos-1]=element;
        //System.out.println("Insert array =");
        
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]+"");
        }
    }
}
