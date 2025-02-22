package ex_7_Incriment_Decriment_OP;

public class Lab_70_I_D_Op {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;   // value is incremented first and then stored in the result
        System.out.println(b);
        System.out.println(a);


        //Exp and Result Table
        // Line NO | value a | value b
        // 5 | 10 | na
        // 6 | 11 | 11
        //7 | 11 | NA
        //8 | NA | 11
    }
}
