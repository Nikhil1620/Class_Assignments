//Write a program to calculate the power of a number using loops.

import java.util.Scanner;

class Function
{
    int CalculatePower(int iNo1, int iNo2)
    {
        int iCnt = 0;
        int iPower = 1;

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            iPower = iPower * iNo1;
        }

        return iPower;
    }
}

class Question5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Power: ");
        int iValue2 = sobj.nextInt();

        int iResult = 0;
        

        Function fobj = new Function();

        iResult = fobj.CalculatePower(iValue1, iValue2);

        System.out.println("The Answer is : " + iResult);

    }

}
