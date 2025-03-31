package ex_19_OOPs_Part2.poly.methodoveridding;
// it means replacing something

public class Lab175 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();  // pramod ka home call hoga
        p.p1();

        Father f1 = new Father();
        f1.home();  // father ka home call hoga
        f1.f1();

// can we do--> yes, it is a consept of Dynamic Dispatch
        Father f2 = new Pramod(); // Dynamic Dispatch -
        // ab kon sa home call hoga --> it is base on the obj, which obj is created promod ka.if promod does't have home then father ka call hoga.

        f2.home(); // this part (line 15- 18) called as a method overriding
        // you have ridden the father method by using @Override(means same name).
        // no problem with diff name but it same h to we need to write @Override.
        // @Override it shows this method is already written in diff class (father).
        // Dynamic Dispatch says that you can have son obj with the father refference.(Father f2 = new Pramod();) riverse not possible line -25


        // Pramod p3 = new Father();  you not born befour father
    }
}
