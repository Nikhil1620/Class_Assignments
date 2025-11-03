import java.util.Scanner;

class function1
{
    int DisplayEvenSum(int iNo)
    {
        int iCnt = 0;
        int iEvenSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenSum = iEvenSum + iCnt;
            }
            
        }
        return iEvenSum;
    }
}

class function2
{
    int DisplayOddSum(int iNo)
    {
        int iCnt = 0;
        int iOddSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                iOddSum = iOddSum + iCnt;
            } 
        }
        return iOddSum;
    }
}

class Question4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iResult1 = 0;
        int iResult2 = 0;

        function1 fobj1 = new function1();
        
        iResult1 = fobj1.DisplayEvenSum(iValue);

        function2 fobj2 = new function2();
        
        iResult2 = fobj2.DisplayOddSum(iValue);

        System.out.println("The Addition of Even number is : " + iResult1);

        System.out.println("The Addition of odd number is : " + iResult2);
        

    }
}
