
package this_keyword;


public class Computer {
    String brand;
    String cpu;
    int price;
    Computer(String brand, String cpu){
        this.brand=brand;
        this.cpu=cpu;
    }
    Computer(String brand, String cpu,int price){
        this(brand,cpu);
        this.price=price;
    }
    void display(){
        System.out.println("Brand Name: "+brand);
        System.out.println("CPU: "+cpu);
        System.out.println("Price: "+price);
    }
    
}
