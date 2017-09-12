package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int k = scanner.nextInt();

        while (k%3!=0){
            k=k-5;
        }
        if(k<0){
            System.out.print("NO");
        } else {
            System.out.print("Yes");
        }

    }
}
