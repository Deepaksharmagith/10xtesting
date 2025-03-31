package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();  // son has 5 things
        Father f = new Father();  // father has 3 things
        GrandFather gf = new GrandFather();  //  has 2 things

        // imp-- kiss class ka home call hoga?
        // lowest one wale ka
        // if home is prestent in son then son wala, other wise check in father, and then grandfather.
        pramod.home();

        // how can find which one is lowest one--using extend key words.
        // if all of them has home.

//        Son s1 = new GrandFather();  when your grandfather is getting born are you present --no, so wrong
//        Son s1 = new Father();
         // Son amit = new Son();--possible

        GrandFather g1 = new Son();  // when son is getting born grandfather are present--yes, possoble
        GrandFather g2 = new Father();
        Father f2 = new Son();
        // Father f3 = new GrandFather();--not possible




    }
}
