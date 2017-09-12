package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int n = scanner.nextInt();

        if (n>20){
            int k = n/10;
            int m = n - k*10;
            switch(m){
                case 1: System.out.print(n + " korova");
                break;
                case 2:
                case 3:
                case 4: System.out.print(n + " korovy");
                break;
                default: System.out.print(n + " korov");
                break;
            }
        }
        else {
            switch(n) {
                case 1:
                    System.out.print(n + " korova");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(n + " korovy");
                    break;
                default:
                    System.out.print(n + " korov");
                    break;
            }
        }

    }
}
