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

    public boolean CheckEleven()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;
            }   
        }
        return false;

    }
}

class Question3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue = sobj.nextInt();

        boolean bResult = false;

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();
        aobj.Display();

        bResult = aobj.CheckEleven();

        if(bResult == true)
        {
            System.out.println("The number is present in the given array.");
        }
        else
        {
            System.out.println("The number is not present in the given array.");
        }

        aobj = null;
        sobj = null;

        System.gc();
    }
}