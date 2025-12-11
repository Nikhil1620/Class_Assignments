//Write a program to find the minimum of three numbers.

import java.util.Scanner;

class logic
{
    int DisplayMinimum(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            return iNo1;
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}

class Question4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter the third number : ");
        int iValue3 = sobj.nextInt();

        int iResult = 0;

        logic lobj = new logic();
        iResult = lobj.DisplayMinimum(iValue1, iValue2, iValue3);

        System.out.println("The smallest number is " + iResult);
        
    }    


} 
