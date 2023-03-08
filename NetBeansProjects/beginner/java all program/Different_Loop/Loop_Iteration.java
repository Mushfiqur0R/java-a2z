
package Different_Loop;

public class Loop_Iteration {
    public static void main(String[] args) {
        int n=10,sum=0;
        for(int i=n;i>=1;i--){
            sum+=i;
        }
        
        System.out.println("Sum :"+sum);
        System.out.println("i=i+2 iteration is:");
        for (int i=0;i<=n;i=i+2){
           System.out.println(+i); 
        }
        System.out.println("i=i*i iteraton is: ");
        for(int i=10;i>=1;i=i*i){
            
            System.out.println(""+i);
        }
        System.out.println("i=1/2  iteraton is: ");
        for(int i=0;i>=n;i=1/2){
            sum+=i;
            System.out.println(""+sum);
        }
        
    }
        
    

}
