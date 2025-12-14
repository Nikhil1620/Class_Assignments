//Write a program to count the number of digits in a given number.

import java.util.Scanner;

class logic
{
    int DisplayCount(int iNo)
    {
        int iDigit = 0;
        int iCount = 0; 

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount = iCount + 1;
            iNo = iNo / 10;
        }

        return iCount;
    }
}

class Question5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iFrequency = 0;

        logic lobj = new logic();
        iFrequency = lobj.DisplayCount(iValue);

        System.out.println("The number of digits are " + iFrequency);

    }    


} 
