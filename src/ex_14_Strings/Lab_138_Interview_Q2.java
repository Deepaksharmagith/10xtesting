package ex_14_Strings;

public class Lab_138_Interview_Q2 {
    public static void main(String[] args) {

        String s1 = "Hello"; // SCP = 1
        String s4 = "Hello"; // 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3


        // == ?  Comparsion -> == in case of Strings -> This checks the locations refference (which are they belong to, kaha pade h).
//        System.out.println(s1 == s3);  --> F
//        System.out.println(s1 == s2); --> F
//        System.out.println(s2 == s3); --> F

//        System.out.println(s1 == s4); --> T both location are same place (both ot them point to same ) , JVM created 1 hello but assign to s1,s4 (dono ko same references pr rakha h)
//        System.out.println(s3 == s5); --> F


// // equals ( content) -> its check the value not location
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2)); //T
        System.out.println(s2.equals(s3)); //T
        System.out.println(s3.equals(s5)); // F
        System.out.println(s3.equalsIgnoreCase(s5)); // T

// equalsIgnoreCase is used to ignore the upper,lower cases, if values are same then it is True

//  equalsIgnoreCase (it is case insensitive)-> pramod. Pramod, PRAMOD , PraMod . PramoD




    }


}
