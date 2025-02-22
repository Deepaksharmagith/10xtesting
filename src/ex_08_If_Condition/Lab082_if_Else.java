package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!(as integer)"); //as the program will run this line will be executed and the curser will wait for input

        int age = sc.nextInt(); // java.util.InputMismatchException
// as we give i/p the value goes in sc.nextInt() and this asign to int age
// give deepak in i/p a error will come bez it is not intiger see error carefully
        // InputMismatchException
        if (age > 18) {
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not Allowed!");
        }
    }
}
