package beginner;
import java.util.Scanner;
public class Tempe {
    public static void main(String[] args) {
        double f,c;
        System.out.print("Enter Celsius:");
        Scanner a= new Scanner(System.in);
        c = a.nextDouble();
        f=1.8*c+32;
        System.out.println("F="+f);
    }
}