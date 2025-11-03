import java.util.Scanner;

class Function
{
    int DisplayEvenCount(int iNo)
    {
        int iCnt = 0;
        int iFrequency1 = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iFrequency1 = iFrequency1 + 1;
            }
        }
        return iFrequency1;
    }

    int DisplayOddCount(int iNo)
    {
        int iCnt = 0;
        int iFrequency2 = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                iFrequency2 = iFrequency2 + 1;
            }
        }
        return iFrequency2;
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iResult1 = 0;
        int iResult2 = 0;
        
        Function fobj1 = new Function();
        iResult1 = fobj1.DisplayEvenCount(iValue);

        Function fobj2 = new Function();
        iResult2 = fobj2.DisplayOddCount(iValue);

        System.out.println("The count of Even number is : " + iResult1);
        System.out.println("The count of Odd number is : " + iResult2);

    }
}