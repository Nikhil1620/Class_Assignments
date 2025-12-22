//Accept N numbers from user and display all such elements which are divisible by 3 and 5.

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

    public void DivisibleByThreeFive()
    {
        int iCnt = 0;

        System.out.println("The numbers which are divisible by 5 and 3 : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 3 == 0 && Arr[iCnt] % 5 == 0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class Question4
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue1 = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        aobj.DivisibleByThreeFive();

        aobj = null;
        sobj = null;

        System.gc();
    }

}
