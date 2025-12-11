//Write a program to calculate the power of a number using loops.

import java.util.Scanner;

class Function
{
    void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit +" ");
            iNo = iNo / 10; 
        }
        
    }
}

class Question4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();
        

        Function fobj = new Function();

        fobj.DisplayDigits(iValue);

    }

}
