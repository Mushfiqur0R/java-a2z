
package st;


public class String {
    public static void main(String[] args) {
        java.lang.String s1 = "I love my university";
        java.lang.String s2 = "Programming is my passion ";
        System.out.println(s2.trim()+"and I love Java");//trim
        java.lang.String d = s1.concat(s2);//Concat
        System.out.println(d);
        char e = s1.charAt(4);//charAt
        System.out.println(e);
        System.out.println(s2.substring(3));//substring
        java.lang.String replaceStr = s1.replace('e','o');//replace
        System.out.println(replaceStr);
    }
}
