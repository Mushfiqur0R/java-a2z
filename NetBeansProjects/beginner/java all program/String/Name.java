
package String;


public class Name {
    public static void main(String[] args) {
        String s1= "I love my University";
        String s2= "Programming is my passion";
        String d=s1.concat(s2);
        System.out.println(d);
        
        int e=s1.length();
        System.out.println(e);
        int e1=s2.length();
        System.out.println(e1);
   
        int f=s1.charAt(4);
        System.out.println(f);
        int f1=s2.charAt(4);
        System.out.println(f1);
        
        int g=s1.indexOf("U");
        System.out.println(g);
        int g1=s2.indexOf("U");
        System.out.println(g1);
    }
}
