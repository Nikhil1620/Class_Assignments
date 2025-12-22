//Accept N numbers from user and return difference between summation of even elements and summation of odd elements.

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

    public int EvenOddSumDiff()
    {
        int iCnt = 0;
        int iEvenSum = 0;
        int iOddSum = 0;
        int iDifference = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + Arr[iCnt];
            } 
        }

        iDifference = iEvenSum - iOddSum;

        if(iDifference < 0)
        {
            iDifference = -iDifference;
        }

        return iDifference;  
    }
}

class Question1
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue1 = sobj.nextInt();
        int iResult= 0;

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        iResult = aobj.EvenOddSumDiff();

        System.out.println(iResult+" is the difference between the sum of even and odd numbers in the given array.");

        aobj = null;
        sobj = null;

        System.gc();
    }

}
