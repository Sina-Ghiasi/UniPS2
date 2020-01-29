package com.company;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
    String id;
    String name;
    int age;
    static int i=0;
    Student(){
        System.out.println("Enter name :");
        name =in.nextLine();
        System.out.println("Enter id :");
        id =in.nextLine();
        i++;
    }

}
