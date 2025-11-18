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

    public boolean CheckNumber(int iNum)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNum)
            {
                return true;
            }   
        }
        return false;
    }
}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the number that shoud be found : ");
        int iValue2 = sobj.nextInt();

        boolean bResult = false;

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        bResult = aobj.CheckNumber(iValue2);

        if(bResult == true)
        {
            System.out.println("The given number is present in the array.");
        }
        else
        {
            System.out.println("The given number is not present in the array.");  
        }

        aobj = null;
        sobj = null;

        System.gc();
    }
}