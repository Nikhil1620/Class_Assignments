//Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

import java.util.Scanner;

class Function
{
    void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt +" ");
            }
        }

    }
}

class Question5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Function fobj = new Function();

        fobj.Display(iValue);

    }

}
