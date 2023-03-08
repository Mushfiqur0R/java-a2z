
package beginner;

abstract class Programming
{
    abstract public void doProgram();
}
 class Programmer extends Programming
{
    @Override
    public void doProgram()
    {
        System.out.println("Lets do some program");
    }
}
public class Abstract {
    public static void main(String[] args) {
        
        Programming obj= new Programmer();
        obj.doProgram();
    }
    
}
