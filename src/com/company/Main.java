package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if((a==0)&&(b==0)){
            System.out.print("INF");
        }
        else{
            if(d%c==0){
                System.out.print("NO");
            }
            else{
            if (b%a==0){
                int x = -b/a;
                System.out.print(x);
            }
            else{
                    System.out.print("NO");
            }}
        }






    }
}
