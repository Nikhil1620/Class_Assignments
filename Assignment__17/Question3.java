//Write a program to find the maximum of two numbers.

import java.util.Scanner;

class logic
{
    int DisplayMaximum(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int iValue2 = sobj.nextInt();

        int iResult = 0;

        logic lobj = new logic();
        iResult = lobj.DisplayMaximum(iValue1, iValue2);

        System.out.println("The maximum number is " + iResult);
        
    }    


} 
