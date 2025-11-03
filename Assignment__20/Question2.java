import java.util.Scanner;

class Function
{
    void DisplayReverseNum(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt +" ");
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Function fobj = new Function();
        fobj.DisplayReverseNum(iValue);
    }
}