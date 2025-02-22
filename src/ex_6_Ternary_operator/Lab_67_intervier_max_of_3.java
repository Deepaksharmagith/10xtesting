package ex_6_Ternary_operator;

public class Lab_67_intervier_max_of_3 {
    public static void main(String[] args) {
        // Find the largest no , n1, n2 n3

        //Step 1 --> Find the input
        //n1,n2,n3--> dayta type --> int
        //o\p that we need to take --> int
        //asked exampal 23,34, 56 --> 56

        //step 2 --> Rough logic

        // n1 >=n2 --> o/p will be ( Y N )
        // if Y then check -- n1 >  n3,   if N --n2 > n3

        int n1 = 2, n2 = 8, n3 = -7;
        int largest = (n1 >= n2)? ((n1 >= n3)? n1 : n3) : ((n2 >= n3)? n2 : n3);

        System.out.println(largest);
    }
}
