package ex_19_OOPs_Part2.inheritance.hierarchical;
// it means multiple childreans

public class Lab171_Hierarchical {
    public static void main(String[] args) {

        Pramod p1 = new Pramod();
        p1.h2(); // its own home
        p1.home();  // fathes home also can use

        Lucky l1 = new Lucky();
        l1.l2();  // its own home
        l1.home(); // fathes home also can use

        Ruhani r1 = new Ruhani();
        r1.r1();
        r1.home();



    }
}
