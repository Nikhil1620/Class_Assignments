import java.util.Scanner;

class Function
{
    int DisplayDigitMulti(int iNo)
    {
        int iDigit = 0;
        int iMulti = 1;             

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMulti = iMulti * iDigit;
            iNo = iNo / 10; 
        }

        return iMulti;
    }
}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iResult = 0;
        
        Function fobj = new Function();
        iResult = fobj.DisplayDigitMulti(iValue);

        System.out.println("The product is : " + iResult);

    }
}