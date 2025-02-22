package ex_13_Function;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab_129_Task {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)


                 // Logic Building

        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner  --> Input is int
        //  int -> variable result ->  output is int

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases
        // past this code in claude.ai and ask , find the edge case of this java program.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 ");

        //---------------------------------------------------------------------------------
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }                                                         // this part deal if you use string
        else{                                                     // fix 1st edge case
            System.out.println("Enter the int only");
            System.exit(0);
        }
        //-----------------------------------------------------------------------------------
        // BigInteger a = scanner.nextBigInteger();       // deal with large no, fixed 2nd edge case
        System.out.println("Enter the num2 ");
        int b = scanner.nextInt();
        //--------------------------------------------------------------------------------------
        //Call
        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = modulus(a,b);
        // Print
        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);




    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Div by Zero not allowed!");
        }
        return a / b;
    }

}
