
package Polymorphism02;

class Shape {
    double area(){
        return 0;
    }
}
class Rectangel extends Shape{
    double length,width;
    Rectangel(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area(){
        System.out.print("Area of Rectangel: ");
        return length*width;
    }
}
class Triangel extends Shape{
   double base,higth;
   Triangel(double base,double higth){
       this.base=base;
       this.higth=higth;
   }
   @Override
   double area(){
       System.out.print("Area of Triangel: ");
       return 0.5*base*higth;
   }
}

public class Rectangel_Triangel {
    public static void main(String[] args) {
        Shape a1=new Shape();
        a1.area();
        a1=new Rectangel(1.5,2);
        System.out.println(a1.area());
        a1=new Triangel(10,5);
        System.out.println(a1.area());
    }
}
