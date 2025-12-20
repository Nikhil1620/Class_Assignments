//Accept N numbers from user and return frequency of 11 form it. 

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

    public int ElevenCount()
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                iCount++;
            }   
        }
        return iCount;
    }
}

class Question4
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

        iResult = aobj.ElevenCount();

        System.out.println(iResult+" is the frequency of number 11 in the given array.");

        aobj = null;
        sobj = null;

        System.gc();
    }

}
