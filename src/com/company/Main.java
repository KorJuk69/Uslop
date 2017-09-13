package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( ((a%2==1)||(b%2==1)||(c%2==1))&&((a%2==0)||(b%2==0)||(c%2==0)) ){
            System.out.print("Yes");
        }
        else {
            System.out.print("NO");
        }

    }
}
