package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        a = a * 100;
        c = c * 100;
        int e = ((c+d)-(a+b))/100;
        int f = (c+d)-(a+b) - e*100;
        System.out.print(e+" "+f);

    }
}
