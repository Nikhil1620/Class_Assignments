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

        System.out.println("---------------------------------");
    }

    public int OddMultiplication()
    {
        int iCnt = 0;
        int iMulti = 1;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iMulti = iMulti * Arr[iCnt];
            }   
        }

        return iMulti;
    }
}

class Question5
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue1 = sobj.nextInt();

        int iResult = 0;

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        iResult = aobj.OddMultiplication();

        System.out.println(iResult+" is the product of all odd elements in the given array.");

        aobj = null;
        sobj = null;

        System.gc();
    }
}