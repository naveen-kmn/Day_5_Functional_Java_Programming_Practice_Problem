package com.blp.functionaljavaprogram;

import java.util.Scanner;

public class _3_Distance
{
    public static void main(String[] args)
    {
        double x1,y1,x2,y2,db;

        Scanner n = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        x1 = n.nextDouble();

        System.out.println("Enter the value of x2: ");
        x2 = n.nextDouble();

        System.out.println("Enter the value of y1: ");
        y1 = n.nextDouble();

        System.out.println("Enter the value of y2: ");
        y2 = n.nextDouble();

        db = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distance between two points :" + db);
    }
}
