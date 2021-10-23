package com.blp.functionaljavaprogram;

import java.util.Scanner;

public class _4_Quadratic
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);


        System.out.println("Enter the value of a");
        float a=inp.nextFloat();
        System.out.println("Enter the value of b");
        float b=inp.nextFloat();
        System.out.println("Enter the value of c");
        float c=inp.nextFloat();
        quadratic(a, b, c);
    }

    static void quadratic(float a,float b,float c)
    {
        float root1;
        float root2;
        float delta= b *b-4*a*c;

        if(delta>0.0)
        {
            root1 = (float) (-b + (Math.pow(delta, 0.5)) / 2.0 * a);
            root2 = (float) (-b - (Math.pow(delta, 0.5)) / 2.0 * a);
            System.out.println("Roots are real and unequal");
            System.out.println("Root 1 of equation is "+root1);
            System.out.println("Root 2 of equation is "+root2);
        }
        else if(delta==0.0)
        {
            System.out.println("Roots are real and equal");
            root1 =  (float) (-b /(2.0*a));
        }
        else if(delta<0.0)
        {
            float sqrtval=(float) ((float) Math.sqrt(Math.abs(delta)));
            System.out.println("Roots are unequal and imaginary");
            System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);
        }
    }

}
