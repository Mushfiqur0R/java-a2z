
package this_keyword;


public class Laptop extends Computer {
    String gpu;
    Laptop(String brand, String cpu,int price,String gpu){
        super(brand,cpu,price);
        this.gpu=gpu;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Gpu: "+gpu);
        
    }
}
    

