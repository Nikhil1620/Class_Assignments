//Write a program to print all even numbers up to N.

import java.util.Scanner;

class function
{
    void DisplayEven(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt + " ");
            }
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

        function fobj = new function();
        
        fobj.DisplayEven(iValue);

    }
}

