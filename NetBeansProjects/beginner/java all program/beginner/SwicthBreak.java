package beginner;
//import java.util.Scanner;


public class SwicthBreak {
    public static void main(String[] args) {
        
        
        double d =10.5;

	byte b = (byte)d;		//Narrowing double to byte 
	short s= (short)d;		//Narrowing double to short 
	int i= (int)d;			//Narrowing double to int 
	long l= (long)d;		//Narrowing double to long
	float f= (float)d;		//Narrowing double to float 
 

	System.out.println("Original double value : " +d);
	System.out.println("Narrowing double value to short : "+ s);
	System.out.println("Narrowing double value to int : "+ i);
	System.out.println("Narrowing double value to long : "+ l);
	System.out.println("Narrowing double value to float : "+ f);
	System.out.println("Narrowing double value to byte : "+ b);
        }
    }
    
}
