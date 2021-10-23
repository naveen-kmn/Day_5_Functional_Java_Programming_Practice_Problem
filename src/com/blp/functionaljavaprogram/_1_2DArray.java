package com.blp.functionaljavaprogram;

import java.util.Scanner;

public class _1_2DArray
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = a.nextInt();
        System.out.println("Enter number of columns");
        int cols = a.nextInt();
        _1_2DArray array2d = new _1_2DArray();
        array2d.array(rows,cols);
    }

    void array(int rows, int cols)
    {
        int[][] arr = new int[rows][cols];
        System.out.println("2D Array");
        for (int i=0;i<= arr.length-1;i++)
        {
            for (int j=0;j<= arr[i].length-1;j++)
            {
                arr[i][j]= 4;
                System.out.print(arr[i][j] + " "+" ");
            }
            System.out.println();
        }
    }
}
