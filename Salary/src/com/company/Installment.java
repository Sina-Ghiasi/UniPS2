package com.company;

import java.util.Scanner;

public class Installment {
    public int i;
    static int j=1;
    String s;
    Scanner in = new Scanner(System.in);
    Installment(){
        System.out.println("Enter Installment "+j+" :");
        s =in.nextLine();
        i =Integer.parseInt(s);
        j++;
    }


}
