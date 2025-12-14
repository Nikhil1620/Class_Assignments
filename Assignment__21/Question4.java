//Write a program to count total number of factors of a given number.

import java.util.Scanner;

class Function
{
    int DisplayFactorsCount(int iNo)
    {
        int iCnt = 0;
        int iFrequency = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFrequency = iFrequency + 1;
            }
        }  
        return iFrequency;
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
        iResult = fobj.DisplayFactorsCount(iValue);

        System.out.println("The factor count of given number is : " + iResult);

    }

}
