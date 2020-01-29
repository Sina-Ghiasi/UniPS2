package com.company;

import java.util.Scanner;

public class Square {
    Scanner in =new Scanner(System.in);
    String s;
    int x,y;
    Square(){
        System.out.println("Enter side a :");
        s =in.nextLine();
        x =Integer.parseInt(s);
        System.out.println("Enter side b :");
        s =in.nextLine();
        y =Integer.parseInt(s);
    }
    public void perimeter(){
        int p =0;
        p=(x+y)*2;
        System.out.println("perimeter : "+p);
    }

    public void area(){
        int a =0;
        a=(x*y);
        System.out.println("area : "+a);
    }


}
