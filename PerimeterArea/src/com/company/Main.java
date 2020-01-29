package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        int c,c1;
        String s;
        System.out.println("Hi!");
        while(true){
            System.out.println("Choose :");
            System.out.println("1-Circle  2-Squre or Rectangle  3-Triangle 4-Exit");
            s =in.nextLine();
            c =Integer.parseInt(s);
            switch (c){
                case 1:
                    System.out.println("Choose 1-area 2-perimeter");
                    s =in.nextLine();
                    c1 =Integer.parseInt(s);
                    Circle tmp =new Circle();
                    switch (c1){
                        case 1:
                            tmp.area();
                            break;
                        case 2:
                            tmp.perimeter();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Choose 1-area 2-perimeter");
                    s =in.nextLine();
                    c1 =Integer.parseInt(s);
                    Square tmp2 =new Square();
                    switch (c1){
                        case 1:
                            tmp2.area();
                            break;
                        case 2:
                            tmp2.perimeter();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Choose 1-area 2-perimeter");
                    s =in.nextLine();
                    c1 =Integer.parseInt(s);
                    Triangle tmp3 =new Triangle();
                    switch (c1){
                        case 1:
                            tmp3.area();
                            break;
                        case 2:
                            tmp3.perimeter();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("GoodBye :)");
                    System.exit(0);
                    break;

            }

        }

    }
}
