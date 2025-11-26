/*
    4. Accept number from user and display below pattern.
    Input : 4
    Output : # 1 * # 2 * # 3 * # 4 *
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t"+iCnt+"\t"+"*\t");
        }
    }
}

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.print("Enter the number: \n");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}

