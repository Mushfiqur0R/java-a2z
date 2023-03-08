
package Constractor;

import ParametriMethod.Student;


public class StuBio {
    public static void main(String[] args) {
        
        Stud student1 = new Stud("Mushfiqur Rahman", "CSE", 55, 2035502002);
        student1.DisplayInformation();
        
        
        Stud student2 = new Stud("Rabbany Rahman","CSE",55,2035302602);
        student2.DisplayInformation();
        
        Stud student3 = new Stud();
        student3.DisplayInformation();
    }
    
}
