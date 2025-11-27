/*
    5. Accept number of rows and number of columns from user and display below
    pattern.
    Input : iRow = 3 iCol = 4
    Output : 1 2 3 4
             5 6 7 8
             9 10 11 12
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iNo = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iNo+"\t");
                iNo++;
            }
            System.out.println();
        }
    }
}

public class Question5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.print("Enter the number of Rows: \n");
        iValue1 = sobj.nextInt();

        System.out.print("Enter the number of Coloumns: \n");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}

