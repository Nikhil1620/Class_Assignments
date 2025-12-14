//Write a program to find the sum of all even numbers up to N.

import java.util.Scanner;

class Function
{
    int calculateEvenSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        return iSum;
    }

}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iResult = 0;

        Function fobj = new Function();
        iResult = fobj.calculateEvenSum(iValue);

        System.out.println("The Even Sum is " + iResult);
    }

}
