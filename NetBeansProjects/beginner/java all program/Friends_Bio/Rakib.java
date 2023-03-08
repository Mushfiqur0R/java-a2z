
package Friends_Bio;


public class Rakib {
    final String Name="Rakibul Islam";
    final static String date_of_birth;
    final int age;
    String addrese;
    String study;
    private int total_gf;

    public int getTotal_gf() {
        return total_gf;
    }

    public void setTotal_gf(int total_gf) {
        this.total_gf = total_gf;
    }
    
//    Rakib(){
//        age=21;
//    }
    
    static {
        date_of_birth="03 October,2000";
    }
    
    Rakib(String addrese,String study,int age){
        this.addrese=addrese;
        this.study=study;
        this.age=age;
    }
    
    void Rakib_bio(){
        System.out.println("");
        System.out.println("Full Name: "+Name);
        System.out.println("Date Of birth: "+date_of_birth);
        System.out.println("Age: "+age);
        System.out.println("Address: "+addrese);
        System.out.println("Study: "+study);
        System.out.println("Total GF: "+total_gf);
    }
    
    
}
