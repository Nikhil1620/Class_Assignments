//Write a program to display all factors of a given number

import java.util.Scanner;

class Function
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt +" ");
            }
        }  
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();
        
        Function fobj = new Function();
        fobj.DisplayFactors(iValue);

    }

}
