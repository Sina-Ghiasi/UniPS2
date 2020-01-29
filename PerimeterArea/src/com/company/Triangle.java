package com.company;

import java.util.Scanner;

public class Triangle {
    Scanner in =new Scanner(System.in);
    String s;
    int x,y;
    Triangle(){
        System.out.println("Enter side :");
        s =in.nextLine();
        x =Integer.parseInt(s);
        System.out.println("Enter hight :");
        s =in.nextLine();
        y =Integer.parseInt(s);
    }
    public void perimeter(){
        int p =0;
        p=(x)*3;
        System.out.println("perimeter : "+p);
    }

    public void area(){
        int a =0;
        a=(x*y)/2;
        System.out.println("area : "+a);
    }
}
