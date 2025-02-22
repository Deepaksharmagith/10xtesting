package ex_08_If_Condition;

import java.util.Scanner;

public class Lab089_HackerRank_EdgeCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score!");
        int score = sc.nextInt();
        char grade = 'F'; // default value of local varaible is good practice.
        //char grade; this can be run by using this line, or upper line

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score > 100) {   // use & and debug
            grade = 'O';
            System.out.println("LOL, You are God Level!");
        } else {
            grade = 'F';
        }

        System.out.println("Your Grade is -> " + grade);


        // Step 4: edge cases--> use chatgpt



    }
}
