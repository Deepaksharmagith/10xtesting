package ex_6_Ternary_operator;

public class Lab_68_age_classification {
    public static void main(String[] args) {
        // divided age in adult > 18, minor < 18 , senior > 65

        int age = 25;
        //String result = (age < 18) ? "Minor" : (age < 65)? "Adult" : "Senior";
        String result = (age > 18)? (age > 65)? "SE" : "MI" : "minor";
        System.out.println(result);
    }
}

