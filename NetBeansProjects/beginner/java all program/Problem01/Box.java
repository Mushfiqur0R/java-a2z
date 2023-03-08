
package Problem01;


public class Box {
    double height,width,depth;
    
    Box(double h,double w,double d){
        height=h;
        width=w; //Instance Veriable hiding for using this.width=width
        depth=d;
    }
    void displayVol(){
     double volume= height*width*depth;
        System.out.println("Volume= "+volume);
          
    }
    
}
