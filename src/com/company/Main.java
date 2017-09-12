package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a>b){
            if(a>c){
                if(a<(b+c)){
                    System.out.print("Yes");
                }
                else {
                    System.out.print("NO");
                }
            }
            else {
                if(c<(a+b)){
                    System.out.print("Yes");
                }
                else {
                    System.out.print("NO");
                }
            }
        }
        else {
            if(b>c){
                if(b<(a+c)){
                    System.out.print("Yes");
                }
                else {
                    System.out.print("NO");
                }
            }
            else {
                if(c<(a+b)){
                    System.out.print("Yes");
                }
                else {
                    System.out.print("NO");
                }
            }
        }

    }
}
