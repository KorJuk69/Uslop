package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a>=(b+c))||(b>=(a+c))||(c>=(a+b))){
            System.out.print("impossible");
        }
        else {
            if((c*c==(a*a+b*b))||(a*a==(c*c+b*b))||(b*b==(a*a+c*c))){
                System.out.print("right");
            }
            else {
                if (((c*c)>(a*a+b*b))||((a*a)>(c*c+b*b))||((b*b)>(a*a+c*c))){
                    System.out.print("obtuse");
                }
                else {
                    System.out.print("acute");
                }
            }
        }

    }
}
