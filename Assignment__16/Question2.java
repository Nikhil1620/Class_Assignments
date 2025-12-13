//Write a program to check whether a given number is even or odd.

import java.util.Scanner;

class logic
{
    boolean CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        boolean bRet = false;

        logic lobj = new logic();
        bRet = lobj.CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println("The number is Even.");
        }
        else
        {
            System.out.println("The number is Odd.");
        }
    }    


} 
