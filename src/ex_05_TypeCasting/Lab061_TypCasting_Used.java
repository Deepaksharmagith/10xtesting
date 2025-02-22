package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    // GST - 18.45
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total_int = course+GST; // Narrowing - Implicit is not possible (we can't store in int bez one is flot 2 is int)
        int total_int = course+(int)GST; // Narrow - Explicit possible ( here we have loosed .45

        float total = course+GST; // Widenning - implicit (automaticall done if data type is float)
        float total2 = (float) course+GST; // Widenning - Explicit (done by write (float))
        System.out.println(total);
    }


}
