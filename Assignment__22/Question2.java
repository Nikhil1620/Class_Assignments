import java.util.Scanner;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int iNo)
    {
        iSize = iNo;

        Arr = new int [iSize];    //Need to remember
    }

    public void Accept()
    {
        Scanner sobj1 = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the numbers : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj1.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("The elements of the array are : ");

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int EvenOddCoutDifference()
    {
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;
        int iDifference = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 ==0)
            {
                iEvenCount++;
            }
        }

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 !=0)
            {
                iOddCount++;
            }
        }

        iDifference = iEvenCount - iOddCount;

        if(iDifference < 0)
        {
            iDifference = -iDifference;
        }

        return iDifference;
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue = sobj.nextInt();

        int iResult = 0;

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.Display();

        iResult = aobj.EvenOddCoutDifference();

        System.out.println(iResult +" is the difference between count of even and Odd numbers in the given array");

        aobj = null;
        sobj = null;

        System.gc();
    }
}