/*
    4. Accept number of rows and number of columns from user and display below
    pattern.
    Input : iRow = 4 iCol = 5
    Output : 4 4 4 4 4
             3 3 3 3 3
             2 2 2 2 2
             1 1 1 1 1 
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

public class Question4
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

