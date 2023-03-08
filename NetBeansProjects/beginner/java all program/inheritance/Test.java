
package inheritance;


public class Test {
    public static void main(String[] args) {
        
        Persone teacher1 = new Persone();  //Class Veriable Declear
        
        teacher1.name= "Rakib Sir";
        teacher1.gender="Male";
        teacher1.phone=12345677;
        
        System.out.println("Name:"+teacher1.name);
        System.out.println("Gender:"+teacher1.gender);
        System.out.println("phone:"+teacher1.phone);
        
        Persone teacher2 = new Persone();
        teacher2.name= "Tanvir Sir";
        teacher2.gender="Male";
        teacher2.phone=56345677;
        
        System.out.println("");
        System.out.println("Name:"+teacher2.name);
        System.out.println("Gender:"+teacher2.gender);
        System.out.println("phone:"+teacher2.phone);
    }
    
}
