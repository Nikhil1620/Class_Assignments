/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 5 iCol = 5
Output : a b c d e
         1 2 3 4 5
         a b c d e
         1 2 3 4 5
         a b c d e 
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        

        for(i = 1; i <= iRow; i++)
        {
            int iNo = 1;
            char ch = 'a';

            for(j = 1; j <= iCol; j++)
            {
              if(i % 2 != 0)
              {
                System.out.print(ch+"\t");
                ch++; 
              }
              else
              {
                System.out.print(iNo+"\t");
                iNo++;
              }        
            }
            System.out.println();
        }
    }
}

public class Question3
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

