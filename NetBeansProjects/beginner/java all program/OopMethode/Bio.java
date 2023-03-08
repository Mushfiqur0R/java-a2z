
package OopMethode;

import inheritance.Persone;


public class Bio {
    public static void main(String[] args) {
        
        Student student1 = new Student();  //Class Veriable Declear
        student1.name= "Mushfiqur Rahman";
        student1.department="CSE";
        student1.batch=55;
        student1.id=2035502002;
        student1.DisplayInformation();
        
        
        Student student2 = new Student();  //Class Veriable Declear
        student2.name= "Rabbany Rahman";
        student2.department="CSE";
        student2.batch=55;
        student2.id=2035303202;
        student2.DisplayInformation();
        
    }
    
}
