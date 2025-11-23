import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t"+"#\t");
        }
    }
}

public class Question2
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
