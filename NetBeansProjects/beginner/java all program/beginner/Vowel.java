
package beginner;
import java.util.Scanner;


public class Vowel {
    public static void main(String[] args) {
        System.out.print("Enter a word:");
        char ch;
        Scanner a= new Scanner(System.in);
        ch = a.next().charAt(0);
        
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
   
        }
        
        else if (ch='w' || ch='y') {
            System.out.println("Semi Vowel");
        } 
        else{
            System.out.println("Consonant");
     
        }
        
    }
    
}
