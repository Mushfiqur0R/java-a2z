
package Abstraction02;
abstract class Shape{
    double dia1,dia2;
     Shape(double dia1,double dia2){
         this.dia1=dia1;
         this.dia2=dia2;
     }
     abstract void area();
}

class Rectiangel extends Shape{
    double result;
    Rectiangel(double dia1,double dia2){
         super(dia1,dia2);
     }
    @Override
    void area(){
       result=dia1*dia2;
       System.out.println("Rectiangel: "+result);
    }
}

class Triangel extends Shape{
    double result;
    Triangel(double dia1,double dia2){
        super(dia1,dia2);
    }
    @Override
    void area(){
        result=0.5*dia1*dia2;
        System.out.println("Triangel: "+result);
    }
}

class Circle extends Shape{
    double result;
    double r= dia1=dia2;
    Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        result=Math.PI*r*r;
        System.out.println("Circle: "+result);
    }
    
}

public class Rectiangle_Triangel_Circle {
    public static void main(String[] args) {
        Shape sh;
        sh=new Rectiangel(5,10);
        sh.area();
        sh=new Triangel(2,5);
        sh.area();
        sh=new Circle(2);
        
    }
}
