package ex_13_Function;

public class Lab_126_User_Defined {
    public static void main(String[] args) { // Jvm program (continously  running in your RAM)
        // (String[] args) --> this is an argument
        // Yaha tk abhi it will not run, return void mean nothing so use step 2
        // Step- 2 --> Call the function
        main();  // give the function name
        greet();
    }

    // i can create another main function, it will return nothing
    //step 1- Declaration / Define
    static void main(){
        System.out.println("Hi, another Look like of main");

    }


    // greet() in this bracket no argument/ parameter
    // bez of void, NO return
    // if you want to return you have to store the value
    // Math.max(3,4) --this function return something which is 4
    // println(), printf(), print() -- also a function, it just print, does't return anything
    // if you want to return the use return key word like

    // println("HI, bro")
    // return

    // It is Without Parameters and Without Return Type.
    // or we can say NO argument and no return type
    static void greet(){
        System.out.println("HI, bro");  // "HI, bro" is  an argument

    }
}
