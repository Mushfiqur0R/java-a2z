
package final_keyword;
class A{
    final String University ="City University";
    final int fee;
    static final int Total_Student;
    A(){
    fee=35600;
    }
    static{
        Total_Student=6000;
    }
    void display(){
        System.out.println("Name: "+University);
        System.out.println("Fees: "+fee);
        System.out.println("Total Student: "+Total_Student);
    }
}

public class University {
    public static void main(String[] args) {
        A u1= new A();
        u1.display();
    }
    
}
