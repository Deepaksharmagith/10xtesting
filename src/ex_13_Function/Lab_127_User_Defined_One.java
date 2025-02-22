package ex_13_Function;

import java.util.Scanner;

public class Lab_127_User_Defined_One {
    public static void main(String[] args) {   // what will heppen if i remove this line

       //1
        dog();

       //2
        String s = greed_with_hello();  // all string will store in s, now print (greed_with_hello() = HI, how are you)
        System.out.println(s);
        int A = age_to_vote();
        System.out.println(A);
        age_to_vote(); // what will heppen-- Nothing return, bez you did't store in variable

        //3
        greet_with_the_name("Deepak");
        greet_with_the_name("Deepak","sharma");
        greet_with_details("Deepak", 21, 10);

        // give user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your age"); // if you not print this to tume pta nahi chalaga ki ab kya likhna  see in salary
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        greet_with_details(name, age, salary);

        //4
        int sum = sum_of_number(3,4);
        System.out.println("sum of numbers" + sum);


//-----------------------------------------------------------------------------------------------
    }
    //   1. Without Parameters and Without Return Type
    static void dog(){
        System.out.println("HI dog");
    }
 //   2. Without Parameters but With Return Type
    static String greed_with_hello(){  // no parameter bez nothing give in () , but it will return String
        return "HI, how are you";   // it will return this string

    }

    static int age_to_vote(){
        //System.out.println("ddddd");
        return 18;

    }

//    3. With Parameters and Without Return Type

    static void greet_with_the_name(String name){
        System.out.println("HI, your name is " + name);
    }

    // can we create unlifited no of argument--> yes
    static void greet_with_the_name(String firstname, String lastname){
        System.out.println("HI, your name is " + firstname + lastname);
    }

    static void greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->"+ name +  "\nYour age is "+age + "\nYour salary is "+ salary);
    }
//    4. With Parameters and With Return Type
    static int sum_of_number(int a, int b){
        return a+b;
    }
}

// 90% we use With Parameters and Without Return Type
//int result = Math.max(3,4) --> 4th type , yee taking argu and return also.
// Q what is the benifit of return, and use case
// what will happen if we remove void