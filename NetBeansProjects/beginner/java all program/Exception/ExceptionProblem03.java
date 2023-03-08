package Exception;

import java.util.Scanner;

public class ExceptionProblem03 {

    public static void main(String[] args) {
        int num1, num2, result;
        

        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please Enter 1st Number: ");
                num1 = input.nextInt();
                System.out.print("Please Enter 2nd Number: ");
                num2 = input.nextInt();
                result = num1 / num2;
                System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter intiger.\nPlease try again");

            }
        }

    }

}
