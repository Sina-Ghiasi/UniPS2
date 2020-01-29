package com.company;

import java.util.Scanner;

public class Score {
    Scanner in = new Scanner(System.in);
    public int score;
    String name;
    String s;
    Score(){
        System.out.println("Enter subject name:");
        name =in.nextLine();
        System.out.println("Enter score :");
        s =in.nextLine();
        score = Integer.parseInt(s);
    }

}
