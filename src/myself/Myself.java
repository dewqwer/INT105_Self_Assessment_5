package myself;

import java.util.Scanner;

public class Myself {

    public static void main(String[] args) {

        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;

        System.out.println("max byte = " + max);
        System.out.println("max byte = " + min);
        System.out.println("");
        System.out.println("max++ = " + max++);
        System.out.println("min-- = " + max--);
        System.out.println("");

        byte num = 0;
        for (int i = 0; i <= 149; i++) {
            System.out.println("i = " + i + " num = " + num);
            num++;

        }

    }

}
