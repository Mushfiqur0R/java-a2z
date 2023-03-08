
package Static_keyword;


public class Student {
    String name;
    int id;
    static String univercityName= "CU";
    
    Student (String n,int i)
    {
        name=n;
        id=i;
    }
    void displayinformation ()
    {
        System.out.println("Name:" +name);
        System.out.println("ID:" +id);
        System.out.println("Univercity name:" +univercityName);
    }
    
    
}
