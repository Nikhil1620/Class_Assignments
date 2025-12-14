//Write a program to find the largest digit in a given number.

import java.util.Scanner;

class Function
{
    int DisplayLargeDigit(int iNo)
    {
        int iDigit = 0;
        int iMaxDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMaxDigit)
            {
                iMaxDigit = iDigit;
            }
            iNo = iNo / 10; 
        }

        return iMaxDigit;
    }
}

class Question4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iResult = 0;
        
        Function fobj = new Function();
        iResult = fobj.DisplayLargeDigit(iValue);

        System.out.println("The largest digit is : " + iResult);

    }

}
