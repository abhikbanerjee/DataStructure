package com.mycompany.interviews;
import java.util.Random;

public class TestMathFunctions {

    public static void main(String args[])
    {
//        double x = 2.17d;
//        double y = 2.99d;
//        double x = -2.99d;
////        double x = 2.17d;
//        System.out.println("Abs value "+ Math.abs(x));
//        System.out.println("Ceil value "+ Math.ceil(x));
//        System.out.println("Floor value "+ Math.floor(x));
//        System.out.println("pow value "+ Math.pow(x, 3.14));
//
//        System.out.println("sqrt value "+ Math.sqrt(255));
//
//        System.out.println("");
//        System.out.println("Abs value "+ Math.abs(y));
//        System.out.println("Ceil value "+ Math.ceil(y));
//        System.out.println("Floor value "+ Math.floor(y));
//        System.out.println("pow value "+ Math.pow(y, 3.14));

//        Character ch [] = new char []{'a','b'};


//        System.out.println("");
//        System.out.println("Character class method checks");
//        char ch1 = '8';
//        char ch2 = 'a';
//        char ch3 = 'A';
//        System.out.println(Character.getNumericValue(ch1));
//        System.out.println(Character.getNumericValue(ch2));
//        System.out.println(Character.getNumericValue(ch3));
//        System.out.println((int)Character.MIN_VALUE);
//        System.out.println((int)Character.MAX_VALUE);
//        System.out.println((int)ch1);
//        System.out.println((int)ch2);
//        System.out.println((int)ch3);

        for(int i=0;i<10;i++) {
            System.out.println("");
            System.out.println("Random class method checks");

            Random rnd = new Random();
            System.out.println(rnd.nextInt(16));
            System.out.println(rnd.nextInt());
            System.out.println(rnd.nextBoolean());
            System.out.println(rnd.nextDouble());
            System.out.println(rnd.nextGaussian());
        }

    }
}
