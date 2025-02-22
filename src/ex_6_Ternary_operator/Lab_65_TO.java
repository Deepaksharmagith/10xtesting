package ex_6_Ternary_operator;

public class Lab_65_TO {
    public static void main(String[] args) {

    // Q- Find the maximun number between two numbers.
    // X and Y --> give max no b/w x, y --> use ternary Op

    int X = 10;
    int Y = 20;
    int max = X > Y ? X : Y;
    // String max = X > Y ? "X is max" : "Y is max";   (if you want to print text)
        System.out.println(max);
    }
}
// 20 will be assigned to max