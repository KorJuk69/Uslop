package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int k = scanner.nextInt();
        int a = k+4;
        int b = a/4;
        int c = b*4-4;

        if (k==c){
             System.out.print("Yes");
        }
        else{
            System.out.print("NO");
        }



    }
}
