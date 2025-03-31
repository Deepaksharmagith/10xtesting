package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}

class Father {  // constructor
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;
    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {  // in my own constructor i can excess father's constructor.

    Son() {
        super();
    }

    void t1() {
        super.home(); //if i call t1-> it basically says that call my parent, means son is able to axcess father's property
        System.out.println(super.gold);
    }
}