package ex_15_Strings_Functions;

public class Lab143_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String - > use 90%
        // StringBuilder -> use 5-7% (Thread safty - we avoid it)
        // ThreadLocal -> Multi Threading -> do Thread safty


        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
// here reverse krana easy h bez here data present in 1 string so it can change themself.

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Sharma");
        System.out.println(stringBuilder);

        stringBuilder.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(stringBuilder); // Output: Hello World!


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
