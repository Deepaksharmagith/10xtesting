package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;
//Q how many types of literals here -- 2 int, string
        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator - + performed as Concatenation
//Firstname + last + 3 + 6 phle code ne concatenate se start hua h to yee no bi con... Honge

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PramodDutta



        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub



    }
}
