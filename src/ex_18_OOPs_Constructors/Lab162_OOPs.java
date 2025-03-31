package ex_18_OOPs_Constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        new Baby();
        // till here 3 times obj is created so Constructor will run 3 times.& print 3 times
        Baby b2;  // is case m Constructor nahi chalega bez obj hi nahi h


    }
}


class Baby{                 // this baby or neche wala baby name should be same. & it is no return type
    String name;            // Constructor & class name should be same.

    // Default Constructor also called , that moment you created an obj this function will automatically call.
    Baby(){
        System.out.println("I am called, Object is created!");
    }

    // Instance initialization block  , it is not a Constructor, it will call with the Constructor
    // use--> it provides some extra functionality, it is up on you , you can use it or not
    {
        System.out.println("Step 1 - Called Database before working!!");

    }


}