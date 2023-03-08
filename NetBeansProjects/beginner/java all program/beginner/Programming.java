
package beginner;
public abstract class Main {
    static void Print()
    {
        System.out.println("Lets do some program!!");
    }
}

public class Abstract2 extends Main {
    public static void main(String[] args) {
        Main obj= new Abstract2();
        
        obj.Print();
    }
    
}
