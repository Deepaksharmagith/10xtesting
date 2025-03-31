package ex_19_OOPs_Part2.poly.methodoverloading;

public class MathOperations {

    int add(int a, int b){

        return a+b;
    }

    int add(int a, int b, int c){

        return a+b+c;
    }

    double add(double a, double b) {

        return a + b;
    }

}
// this method says that in same class you can have a multiple function with same name with diff argument --> method is overload
