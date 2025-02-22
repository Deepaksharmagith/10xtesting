package ex_14_Strings;

public class Lab_139_String_Functions {
    public static void main(String[] args) {
        String a1 = "deepak, O shar ma";
        String reassigned = a1.substring(5,9);
        System.out.println(reassigned);

        String c = "deepak";
        String d = c.concat("sharma");
        System.out.println(d);
    }
}
