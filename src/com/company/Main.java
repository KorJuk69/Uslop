package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = 	new Scanner(System.in);
        int n = scanner.nextInt();
        int p60=0;
        int p20=0;
        int p10=0;
        int p5=0;
        int p1=0;

        while (n>=60){
            p60++;
            n=n-60;
        }
        if(n<20){
            p20=1;
        }
        else {
            while (n>=20){
                p20++;
                n=n-20;
            }
            if(n<10){
                p10=1;
            }
            else{
                while (n>=10){
                    p10++;
                    n=n-10;
                }
                if(n<5){
                    p5=1;
                }
            }
            while (n>=1){
                p1++;
                n--;
            }}

        int cena60 = 440;
        int cena20 = 230;
        int cena10 = 125;
        int cena5 = 70;
        int cena1 = 15;

        if(cena1*p1>cena5*p5){
            p5++;
            p1=0;
        }
        if((cena1*p1+cena5*p5)>cena10*p10){
            p10++;
            p1=0;
            p5=0;
        }
        if((cena1*p1+cena5*p5+cena10*p10)>cena20*p20){
            p20++;
            p1=0;
            p5=0;
            p10=0;
        }
        if((cena1*p1+cena5*p5+cena10*p10+cena20*p20)>cena60*p60){
            p60++;
            p1=0;
            p5=0;
            p10=0;
            p20=0;
        }

        System.out.print(p1 + " " + p5 + " " + p10 + " " + p20 + " " + p60);

        // ПЕРЕТЕСТИТЬ И ПЕРЕПИСАТЬ
    }
}
