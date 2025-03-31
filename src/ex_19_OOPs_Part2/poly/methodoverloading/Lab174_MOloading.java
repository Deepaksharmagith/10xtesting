package ex_19_OOPs_Part2.poly.methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r = m1.add(3,4);  // as i pass 2 argu then diff function run
        System.out.println(r);

        int r1 = m1.add(3,4,5);  // as i pass 3 argu then diff method run, it means refrence m1 behaving as a morphision (many form)
        System.out.println(r1);


        double r0 = m1.add(3.34,4.56);
        System.out.println(r1);

    }
}
