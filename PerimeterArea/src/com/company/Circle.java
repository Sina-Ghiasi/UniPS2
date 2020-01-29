package com.company;

import java.util.Scanner;

public class Circle {
    Scanner in =new Scanner(System.in);
    String s;
    int x;
    Circle(){
        System.out.println("Enter r :");
        s =in.nextLine();
        x =Integer.parseInt(s);
    }
    public void perimeter(){
        int p =0;
        p=x*3*2;
        System.out.println("perimeter : "+p);
    }

    public void area(){
        int a =0;
        a=(x*x)*3;
        System.out.println("area : "+a);
    }
}
