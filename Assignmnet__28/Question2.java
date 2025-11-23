import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            char ch1 = 'A';
            char ch2 = 'a';
            
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
                else
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
            }
            System.out.println();
        }
    }
}

public class Question2
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
