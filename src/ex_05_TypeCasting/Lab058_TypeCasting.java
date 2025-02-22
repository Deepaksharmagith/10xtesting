package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
//      int a = b; // Valid - > Implicit Casting- Automatically done by compailar, Not need to mention any thing
//      putting a smaller one into bigger is a automatically process so don't have to type (int)b

        int a = (int)b; // Valid - > Explicit Casting- by telling a compailar.

    }
}
