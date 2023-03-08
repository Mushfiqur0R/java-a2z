
package Friends_Bio;


public class RakibBio extends Rakib {
    
    final String College= "BAF SHAHEEN COLLEGE,JASHORE";
    final String Versity= "CITY UNIVERCITY";
    String degree;
    
    void parents(String name,int age,String occupation){
        System.out.println("Father Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Occupation: "+occupation);
    }
    void parents(String name,int age){
        System.out.println("Mother Name: "+name);
        System.out.println("Age: "+age);
    }
    
    RakibBio(String addrese,String study,int age,String degree){
        super(addrese,study,age);
        this.degree=degree;
    }
    
    @Override
    void Rakib_bio(){
        super.Rakib_bio();
        System.out.println("");
        System.out.println("Degree: "+degree);
        System.out.println("College Name: "+College);
        System.out.println("Univercity Name: "+Versity);
    }
    
}
