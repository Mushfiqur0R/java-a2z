
package Exception;


public class ArrayException {
    public static void main(String[] args) {
        
        int a1=30,b=0;
            int d= a1/5;
            int c;
        try{
            int a[]= new int[5];
            a[6]=19;
            c= a1/b;       
        }
        
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(Exception e2){
            System.out.println(e2);
        }
        finally{
            System.out.println("Last Programm in code");
        }
    }
}
