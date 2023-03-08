
package Constractor;


public class Stud {
    
    String name,department;
    int batch,id;
    
    Stud(){
        System.out.println("NO VALUE");
    }
    Stud(String n,String d,int b,int i){
        name=n;
        department=d;
        batch=b;
        id=i;
    }
    
    void DisplayInformation(){
        System.out.println("Name:"+name);
        System.out.println("Department:"+department);
        System.out.println("Batch:"+batch);
        System.out.println("ID:"+id);
        System.out.println("");
    }
    
}
