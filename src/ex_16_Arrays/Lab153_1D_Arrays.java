package ex_16_Arrays;

public class Lab153_1D_Arrays {
    public static void main(String[] args) {
        // int a[]; yes it is valid syntax but there is no size, can we give size -1
        int a[] = new int[-1]; //java.lang.NegativeArraySizeException, compile time not give an error, but run time give an error

        int[] a2 = new int[5];

        int[] a4 = new int[3];

        a4[0] = -90;  // we can store - value
        a4[1] = -91;
        a4[2] = -91;





    }
}
