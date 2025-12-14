//Write a program to check whether a number is a perfect number or not.

import java.util.Scanner;

class Function
{
    int CheckPerfectNum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iResult = 0;

        Function fobj = new Function();
        iResult = fobj.CheckPerfectNum(iValue);

        if(iResult == iValue)
        {
            System.out.println("The number is perfect.");
        }
        else
        {
            System.out.println("The number is not perfect.");
        }
    }

}
