package com.company;

public class SC_chp02_operators {
    public static void main(String[] args) {
//        arithmatics operators
        int x = 34;
        int y = 23;
        int z = x + y;
        System.out.println(z);

        int x1 = 34;
        int y1 = 23;
        int z1 = x - y;
        System.out.println(z1);

        int x2 = 34;
        int y2 = 23;
        int z2 = x * y;
        System.out.println(z2);

        int x3 = 34;
        int y3 = 23;
        int z3 = x / y;
        System.out.println(z3);

        int x4 = 34;
        int y4 = 23;
        int z4 = x % y;
        System.out.println(z4);

//        Assignment operators
        int x5 = 45;
        ++x5;
        System.out.println(x5);

        int x6 = 34;
        --x6;
        System.out.println(x6);


        int x7 = 34;
        System.out.println(x7);

        int x8 = 23;
        x8 +=  3;
        System.out.println(x8);

        int x9 = 23;
        x9 -=  3;
        System.out.println(x9);

        int x10 = 23;
        x10 *=  3;
        System.out.println(x10);

        int x11 = 23;
        x11 /=  3;
        System.out.println(x11);

        int x12 = 23;
        x12 %=  3;
        System.out.println(x12);

        //camparison operators
        int x13 = 24;
        int y13 = 48;
        boolean z13 = x13 < y13;
        System.out.println(z13);

        int x14 = 24;
        int y14 = 48;
        boolean z14 = x14 > y14;
        System.out.println(z14);

        int x15 = 24;
        int y15 = 48;
        boolean z15 = x15 == y15;
        System.out.println(z15);

        int x16 = 24;
        int y16 = 48;
        boolean z16 = x16 != y16;
        System.out.println(z16);

        int x17 = 24;
        int y17 = 48;
        boolean z17 = x17 >= y17;
        System.out.println(z17);

//        logical operators
        boolean x18 = true;
        boolean y18 = true;
        boolean z18 = x18 && y18;
        System.out.println(z18);

        boolean x19 = false;
        boolean y19 = false;
        boolean z19 = x19 || y19;
        System.out.println(z19);


//        precendence and Assesibility
        int x20 = 34;
        double y20 = 13;
        int z20 = x20-(double) (y20/2);
        System.out.println(z20);
















    }
}
