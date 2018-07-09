package com.mycompany.interviews;

public class TestAutoBoxUnboxing
{
    public static void main(String args[])
    {
        int a = 1278637626;
        byte b = 112;
        double k = 12.34D;
        float l = 145.34F;

        Integer s = a;
        Byte b_short = s.byteValue();


        String str = "123.45";

        System.out.println(" ");
        System.out.println("Some AutoBoxing and UnAutoBoxing functionalities");
//        System.out.println(s);
//        System.out.println(s.intValue());
//        System.out.println(b_short);
//        System.out.println(Double.valueOf(str));

        System.out.println(" ");
        System.out.println("Some Unary operations");
//        System.out.println(6&4);
//        System.out.println(1|2);
//        System.out.println(8>>1);
//        System.out.println(-16>>>2);
//        System.out.println(1<<10);
//        System.out.println(~4);
//        System.out.println(Float.toString(-1.23f));
//        System.out.println(Float.parseFloat("-1.23a"));

        System.out.println(" ");
        System.out.println("Ranges for Datatypes ");
        // Get the min and max values for each of the ranges
        System.out.println("Integer MIN, MAX and Size - "+ Integer.MIN_VALUE +" : "+ Integer.MAX_VALUE + " : "+Integer.SIZE);
        System.out.println("Float MIN, MAX and Size - "+ Float.MIN_VALUE +" : "+ Float.MAX_VALUE + " : "+ Float.SIZE);
        System.out.println("Double MIN, MAX and Size - "+ Double.MIN_VALUE +" : "+ Double.MAX_VALUE + " : "+ Double.SIZE);
        System.out.println("Boolean True - "+ Boolean.TRUE);

//        Double x1 =null;
////        Double x1 = 1.23d;
////        System.out.println(Double.compare(x1, 1.23d));
//        System.out.println("Value of Comp" + (x1 == 1.23d));

        System.out.println();
        System.out.println("Play with some of the Binary operations");
        int a_int = 4;
        int b_int = -4;
        int k_rght_shft = a_int>>1;
        int l_left_shft = a_int<<1;
        int k_rght_shft_unsigned = a_int >>> 1;


        System.out.println(" ");
//        System.out.println("A -> " + a_int +" into binary format " +Integer.toBinaryString(a_int));
//        System.out.println("A -> " + a_int +" into binary format right shift " +Integer.toBinaryString(k_rght_shft));
//        System.out.println("A -> " + a_int +" into binary format left shift " +Integer.toBinaryString(l_left_shft));
//        System.out.println("A -> " + a_int +" into binary format right shift unsigned " +Integer.toBinaryString(k_rght_shft_unsigned));
//

        System.out.println("");
        System.out.println("For postive integers");
        System.out.println(" ");
        System.out.println("UnSigned shift");
        System.out.println("A -> " + a_int +" into binary format " +Integer.toBinaryString(a_int));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>2));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>5));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>10));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>29));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>30));
        System.out.println("A -> " + a_int +" into binary format right shift unsigned " + Integer.toBinaryString(a_int>>>31));

        System.out.println(" ");
        System.out.println("Signed shift");
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>2));
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>5));
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>10));
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>29));
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>30));
        System.out.println("A -> " + a_int +" into binary format right shift signed " + Integer.toBinaryString(a_int>>31));


        System.out.println("");
        System.out.println("For negative integers");
        System.out.println(" ");
        System.out.println("UnSigned shift");
        System.out.println("B -> " + b_int +" into binary format " +Integer.toBinaryString(b_int));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>2));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>5));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>10));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>29));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>30));
        System.out.println("B -> " + b_int +" into binary format right shift unsigned " + Integer.toBinaryString(b_int>>>31));

        System.out.println(" ");
        System.out.println("Signed shift");
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>2));
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>5));
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>10));
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>29));
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>30));
        System.out.println("B -> " + b_int +" into binary format right shift signed " + Integer.toBinaryString(b_int>>31));




    }
}
