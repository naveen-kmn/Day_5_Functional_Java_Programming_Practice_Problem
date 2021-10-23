package com.blp.functionaljavaprogram;

import java.util.Scanner;

public class _5_WindChill
{
        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of temperature");
        int temp = sc.nextInt();
        System.out.println("Enter value of wind speed");
        int wind = sc.nextInt();
        int t = calculateWindChill(temp, wind);
        System.out.println("WindChill = " + t);
        }
        static int calculateWindChill(int temp, int wind)
        {
            return (int) Math.floor((35.74 + (0.6215 * temp)) + (((0.4275 * temp) - 35.75) * Math.floor(Math.pow(wind, 0.16))));
        }
}
