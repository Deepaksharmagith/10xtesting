package ex_14_Strings;

public class Lab_137_Interview_Q1 {
    public static void main(String[] args) {
        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP >
        String s10 = "Hello"; // SCP >
// only 1 string is avalable in scp --> hello -->  hello is already present h in scp location h , s1,s2,s10 point towards same location of hello
                                               // hello does't create again.
// how many references are there -- 3

        String s2 = new String("Hello"); //string created in OA
        String s3 = new String("Hello");
        String s5 = new String("hello");
// there are 3 string in oa, oa k andar always new string hi banege, bez new is used to creating new memory, instance

    }
}
