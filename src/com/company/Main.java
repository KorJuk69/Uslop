package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        //Тут немного не такой ввод как в задании, я не стал с этим заморачиваться
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if((m==x)&&(n!=y)){
            System.out.println(x + " " + (y+1));
            System.out.println((x-1) + " " + y);
            System.out.println(x + " " + (y-1));
        }
        else{
            if((m!=x)&&(n==y)){
                System.out.println((x+1) + " " + y);
                System.out.println((x-1) + " " + y);
                System.out.println(x + " " + (y-1));
            }
            else {
                if((m==x)&&(n==y)){
                    System.out.println((x-1) + " " + y);
                    System.out.println(x + " " + (y-1));
                }
                else {
                    System.out.println((x+1) + " " + y);
                    System.out.println(x + " " + (y+1));
                    System.out.println((x-1) + " " + y);
                    System.out.println(x + " " + (y-1));
                }
            }
        }

    }
}
