//Write a program to find the factorial of a number using a for loop.

import java.util.Scanner;

class logic
{
    void DisplayFactorial(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt + " ");
        }
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        logic lobj = new logic();
        lobj.DisplayFactorial(iValue);

    }    


} 
