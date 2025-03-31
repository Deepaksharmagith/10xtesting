package ex_6_Ternary_operator;

public class Lab_64_To_Nested_TO_Interview {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        // first check condition2 then 1

        int number = 15;
        String result = (number > 10) ? (number > 20? "G > 20" : "B/w 10 to 20") : "B";
        // 1st solve inner bracket
        // op of inner bracket is B/w 10 to 20
        System.out.println(result);
    }
}
