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
            if((b%a==0)&&(d%c==0)){
                //если и числитель и знаменатель = 0
            }
            else {
            if (b%a==0){
                int x = -b/a;
                System.out.print(x);
            }
            else{
                if(d%c==0){
                    int x = -d/c;
                    System.out.print(x);
                }
                else {
                    System.out.print("NO");
                }
            }}
        }





    }
}
