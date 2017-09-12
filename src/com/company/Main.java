package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int vremya;

        if(n<=k){
            vremya = n*2*m;
        }
        else{
            vremya = (n/k + 1)*2*m;
        }

        System.out.print(vremya);

    }
}
