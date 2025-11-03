import java.util.Scanner;

class logic
{
    int DisplayAddition(int iNo)
    {
        int iDigit = 0;
        int iSum = 0; 

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }
}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        int iAddition = 0;

        logic lobj = new logic();
        iAddition = lobj.DisplayAddition(iValue);

        System.out.println("The Addition is "  + iAddition);

    }    

} 