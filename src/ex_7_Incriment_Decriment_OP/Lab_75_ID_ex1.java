package ex_7_Incriment_Decriment_OP;

public class Lab_75_ID_ex1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);

        // A --> a++ = 10 , exp1 = 11
        // B --> ++a = 12 , exp2 = 12
        // A + B

        //Line no | a | exp
        // 5      | 11 | NA
        //6       | 11 | 10+11
    }
}
