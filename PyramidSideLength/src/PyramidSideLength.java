/*
Mosammad Kabir
Professor DeBello
4-9-2021
CUS 1115
 */

import java.util.Scanner;
public class PyramidSideLength {
    public static void main(String[] args) {
        int sideLength;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a side length: ");
        sideLength = kb.nextInt();
        //side length=columns

        for (int i = 1; i <= sideLength; i++)// this tells me that there are gonna be 5 rows. outside loops.
        {

            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print("*");
            System.out.println();

        }
    }}}
/*
Enter a side length:
7
*
***
*****
*******
*********
***********
*************
 */




