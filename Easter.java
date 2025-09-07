// Kuang Miao
// This program will calculate the date of Easter in each years

import java.util.Scanner;

public class Easter{
    public static void main(String[] args){
        // code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year number after 1583 ");
        int y = scanner.nextInt();
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int f = (b+8)/25;
        int g = (b-f+1)/3;
        int h = (19*a+b-d-g+15)%30;
        int i = c/4;
        int k = c%4;
        int r = (32 + 2 * e + 2* i - h - k)%7;
        int m = (a+11*h+22*r)/451;
        int n = (h+r-7*m+114)/31;
        int p = (h+r-7*m+114)%31; 
        System.out.print("a = " +a);
        System.out.print(" b = " +b);
        System.out.print(" c = " +c);
        System.out.print(" d = " +d);
        System.out.print(" e = " +e);
        System.out.print(" f = " +f);
        System.out.print(" g = " +g);
        System.out.print(" h = " +h);
        System.out.print(" i = " +i);
        System.out.print(" k = " +k);
        System.out.print(" r = " +r);
        System.out.print(" m = " +m);
        System.out.print(" n = " +n);
        System.out.print(" p = " +p);
        System.out.print(" y = " +y);
     
    }

}