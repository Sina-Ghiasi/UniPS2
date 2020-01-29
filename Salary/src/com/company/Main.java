package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int salary;
        String s;
        System.out.println("Hi ");
        System.out.println("Enter your salary :");
        s = in.nextLine();
        salary = Integer.parseInt(s);
        System.out.println("How many Installment?");
        s =in.nextLine();
        for(int j =Integer.parseInt(s);j>0;j--){
            Installment a =new Installment();
            salary = salary-a.i;

        }
        System.out.println("Your remaining salary is : "+salary);
        System.out.println("GoodBye");
    }
}
