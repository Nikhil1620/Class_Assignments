//Accept N numbers from user and accept one another number as NO , return index of last occurrence of that NO.

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

    public int DisplayIndex(int iNum)
    {
        int iCnt = 0;

        for(iCnt = Arr.length - 1; iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt] == iNum)
            {
                return iCnt;
            }   
        }
        return -1;
    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the number that shoud be found : ");
        int iValue2 = sobj.nextInt();

        int iResult = 0;

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        iResult = aobj.DisplayIndex(iValue2);

        if(iResult == -1)
        {
            System.out.println("The given number is not present in the given array.");
        }
        else
        {
            System.out.println(iResult+" is the index number of the input number in the given array.");
        }

        aobj = null;
        sobj = null;

        System.gc();
    }

}
