package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val  = 200;
     //   Narrowing means--> putting bigger value into smaller data type.
//        byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte)val; // // // Valid -> Explicit Casting -  allowed
            // but Data will Loss, data will be overflow, data will be stored according to data type capicati and after fill the data type , remaining data will overflow
        // in this case data loss will there.
    }
}
