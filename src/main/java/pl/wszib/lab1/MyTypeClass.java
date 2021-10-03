package pl.wszib.lab1;

import java.math.BigInteger;

public class MyTypeClass {
    public static int myInteger;
    public static Integer myInteger2;

    public static void main(String[] args) {
        System.out.println(myInteger);
        Integer integer = myInteger;
        if(integer != null){
            int myInt  = integer.intValue();
        }

        int bigNumber = 10000000;
        long myLong = bigNumber;

        var bigInt = new BigInteger("1000000000000000000000000");
        System.out.println(bigInt);
    }
}
