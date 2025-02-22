package ex_04_Operators;

public class Lab054_Interview {
    public static void main(String[] args) {
        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1); //AB
        // a1+b1 - 65+66 -> 131
        // Rule - concatenation of Strings -> char -> int calculation
        // a1+b1 - 65+66 -> 131
        System.out.println(a1+b1);
    }
}

//Char is a type of integral
//So a, b ka value add hoga
//Rule
//Only string concatenate will happen other m ascii value will come
//For the charrr Integral cal will be happen