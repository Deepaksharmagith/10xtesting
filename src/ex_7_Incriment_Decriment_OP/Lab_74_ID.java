package ex_7_Incriment_Decriment_OP;

public class Lab_74_ID {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a++ + a);

        // A + B
        // A --> a++  ,  a --> B
        // solve
        // A --> a++ --> Exp1(A)-->10 , a =11
        // B--> a = 11 , Exp2 = 11
        // A + B = 21

        // 2 way to break
        //Line no | a | exp
        // 5      | 11 | NA
        //6       | 11 | 10+11
    }
}
