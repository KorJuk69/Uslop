package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = b*b - 4*a*c;

        if(d>0){
            double x1 = (-b + sqrt(d))/(2*a);
            double x2 = (-b - sqrt(d))/(2*a);
            System.out.print(x1 + " " + x2);
        }
        else{
            if(d==0){
                int x = -b/(2*a);
                System.out.print(x);
            }
        }

    }
}
