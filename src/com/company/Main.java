package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int n = scanner.nextInt();
        int bo=0;
        int io=0;
        int i=0;

        while (n>=60){
            bo++;
            n=n-60;
        }
        if(n<10){
            io=1;
        }
        else {
        while (n>=10){
            io++;
            n=n-10;
        }
        while (n>=1){
            i++;
            n--;
        }}

        int cenabo = 440;
        int cenaio = 125;
        int cenai = 15;

        if(cenai*i>cenaio*io){
            io++;
            i=0;
        }
        if((cenai*i+cenaio*io)>cenabo*bo){
            bo++;
            i=0;
            io=0;
        }

        System.out.print(i + " " + io + " " + bo);

    }
}
