package ex_7_Incriment_Decriment_OP;

public class Lab_69_I_D_OP {
    public static void main(String[] args) {

        // Take input using cli

        //int age = 24;   //After apply cli, 24 will be present in args(see in upper) and we take as a o, [0]
        String age_string = args[0]; // this value store in string by defolt, you can cinvert in int
        int age = Integer.parseInt(age_string);
        String canigo = age >= 24 ? "yess" : "NO";
        System.out.println(canigo);
        System.out.println(age);
    }
}
