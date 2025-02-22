package ex_14_Strings;

public class Lab_133 {
    public static void main(String[] args) {
        String s1 = "Hello";
       // s1.concat("World");
        s1 = s1.concat("World");  //new (concatenated)string has been created but it's value is not assigned, so
        System.out.println(s1);       // it's print hello, bez you print s1 string not concatenate string. so reassigned the value.
    }
// here 2 scp are present, 1st is hellow , hellowword.
    // you have to reassigned the value of s1 to assige helloworld.
}
