public class Pyramid {
    public static void main(String[] args)
    {

    /*try to make
     *
     **
     ***
     ****
     *****
     */

    for(int i=1;i<=5;i++)// this tells me that there are gonna be 5 rows. outside loops.
    {

        for (int l = 1; l <= i; l++) {
            System.out.print("*");
        }
        System.out.println();

    }
//*
//**
//***
//****
//*****


    //try opposite now

    for(int i=5;i>=1;i--)// this tells me that there are gonna be 5 rows. outside loops.
    {
        for (int l = 1; l <= i; l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}}
/*
 *****
 ****
 ***
 **
 *
 */

