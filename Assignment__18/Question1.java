// Write a program to check whether a number is prime or not.

import java.util.Scanner;

class logic
{
    boolean CheckPrime(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0 )
        {
            iNo = -iNo;
        }

        if(iNo == 0 | iNo == 1)
        {
            System.out.println("Invalid Number.");
        }

        for(iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                return false;
            }
        }
        return true;
    }
}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        boolean bResult = false;

        logic lobj = new logic();

        bResult = lobj.CheckPrime(iValue);

        if(bResult == true)
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime.");  
        }

    }

}
