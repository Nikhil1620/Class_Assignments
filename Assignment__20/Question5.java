//Write a program to find the smallest digit in a given number.

import java.util.Scanner;

class Function
{
    int DisplaySmallDigit(int iNo)
    {
        int iDigit = 0;
        int iMinDigit = 9;             //need to remember

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit <= iMinDigit)
            {
                iMinDigit = iDigit;
            }
            iNo = iNo / 10; 
        }

        return iMinDigit;
    }
}

class Question5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iResult = 0;
        
        Function fobj = new Function();
        iResult = fobj.DisplaySmallDigit(iValue);

        System.out.println("The largest digit is : " + iResult);

    }

}
