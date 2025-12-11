//Write a program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

class Function
{
    boolean CheckDivisibility(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Marks : ");

        int iValue = sobj.nextInt();
        boolean bResult = false;

        Function fobj = new Function();

        bResult = fobj.CheckDivisibility(iValue);

        if(bResult == true)
        {
            System.out.println("The given number is divisible by 5 and 11.");
        }
        else
        {
            System.out.println("The given number is not divisible by 5 and 11.");
        }
    }

}
