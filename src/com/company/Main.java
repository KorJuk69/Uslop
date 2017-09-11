package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if((a==c)||(b==d)||(a+b==c+d)||(a-b==c-d)){
            System.out.print("Yes");
        }
        else {
            System.out.print("NO");
        }
    }
}
