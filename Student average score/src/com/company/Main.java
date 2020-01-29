package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        int h,all= 0,k;
        String s;
        System.out.println("Hi");
        System.out.println("How many subject do yo have?");
        s =in.nextLine();
        h =Integer.parseInt(s);
        for(k=h;k>0;k--){
            Score a = new Score();
            all += a.score;
        }
        int sas =all/h;
        System.out.println("Your average ia :"+sas);
        if (sas<12){
            System.out.println("You are provisional :/");
        }
        else{
            System.out.println("You are not provisional :)");
        }
        System.out.println("GoodBye!");

    }
}
