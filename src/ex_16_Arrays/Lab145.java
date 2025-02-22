package ex_16_Arrays;

public class Lab145 {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};
        // 2nd
        int[] marks2 = new int[5]; // Fixed Size.
//        int marks3[] = new int[5]; // Fixed Size.
        System.out.println(marks2.length);
//   int[] marks2,  int marks3[] both syntax are valid.
        // here why not use function (marks2.length())
        // in case of array (.length) is a property of array  but in string it will be a function
        String s1 = "Pramod";
        System.out.println(s1.length());
// update the value
        marks2[0] = 91;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;

        System.out.println(marks2[0]);
        System.out.println(marks2[4]);
        System.out.println(marks2[10]); // ArrayIndexOutOfBoundsException






    }
}
