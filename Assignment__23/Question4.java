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

    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iNo1 && Arr[iCnt] < iNo2)
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

        System.out.println("Enter the Starting point : ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter the finishing point : ");
        int iValue3 = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue1);
        aobj.Accept();
        aobj.Display();

        aobj.Display(iValue2, iValue3);

        aobj = null;
        sobj = null;

        System.gc();
    }
}