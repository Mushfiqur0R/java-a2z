// Question 02
package Abstraction03;

abstract class Janata_Bank{
    void call(){
        System.out.println("Janata Bank Rate of Interest is: 7 %");
    }
    abstract void send();
}
class Sonali_Bank extends Janata_Bank{
    @Override
     void send(){
         System.out.println("Sonali Bank Rate of Interest is: 7.5 %!");
     }   
}
class Rupali_Bank extends Sonali_Bank{
    @Override
    void send(){
        System.out.println("Rupali Bank Rate of Interest is: 8 %");
    }
}
public class Bangladesh_Bank {
    public static void main(String[] args) {
        
        Janata_Bank b1;
        b1=new Sonali_Bank();
        b1.call();
        b1.send();
        b1=new Rupali_Bank();
        b1.send();
        
    }
    
}
