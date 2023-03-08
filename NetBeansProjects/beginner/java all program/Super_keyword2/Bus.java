
package Super_keyword2;


public class Bus extends Vehicles{
    double engine;
    Bus(String c,int l,double e){
        super(c,l);// calling vehicles class  constractor
        engine=e;   
    }
    @Override
    void display(){
        super.display();
        System.out.println("Engine Power of CC: "+engine);
    }
    
    
}
