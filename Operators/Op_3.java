package Operators;

public class Op_3 {
    public static void main(String[] args) {
    //   byte b = 8;
    //   b =  (byte) (b<<33);

    //    System.out.println(b); //

//     byte  b  = 1;
//    // b = (byte)(b<<31);
//     int i = (byte)(b<<8);
//     System.out.println(i);

    //Right shift
    // byte b = -128;
    // b =(byte) (b>>>2);
    // System.out.println(b);

    int a = 10; //10
    int b = 55; //11

    boolean  c = a>b && b <a;
    System.out.println(c);


    }
}
//Left-shift
//shifting is done on integer but we do intensinaly by type casting ,that why the bits are truncated,
//eg. b<<7 -> this no is an integr so it should give +128, but we have typecasted so it will  give -128 because msb is acc to byte;
