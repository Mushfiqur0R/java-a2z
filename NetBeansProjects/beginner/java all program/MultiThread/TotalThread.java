
package MultiThread;
class A extends Thread{
    public void run(){
        System.out.println("1st Thread");
    }
}
class B extends A implements Runnable{
    public void run(){
        System.out.println("2nd Thread");
    }
}
//class C extends Thread{
//    public void run(){
//        System.out.println("3rd Thread");
//    }
//    
//}

public class TotalThread {
    public static void main(String[] args) {
        A ob1=new A();
        
        B ob2=new B();
        Thread ob3= new Thread(ob2);
//        C ob3=new C();
        ob1.start();
        ob3.start();
//        ob3.start();
    }
}
