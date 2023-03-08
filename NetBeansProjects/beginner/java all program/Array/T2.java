
package Array;
// Index Position Insert Array
public class T2 {
    public static void main(String[] args) {
        int[]ar={10,20,30,40,50,60};
        int index_pos=3;
        int element=200;
        int i;
        for(i=ar.length-1; i>index_pos; i--){
            ar[i]=ar[i-1];
        }
        ar[index_pos]=element;
        for(i=0; i<ar.length; i++){
            System.out.println(ar[i]+"");
        }
    }
}
