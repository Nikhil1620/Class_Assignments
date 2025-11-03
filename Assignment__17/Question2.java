import java.util.Scanner;

class logic
{
    boolean CheckPalindrome(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iNo = iNo / 10;
        }

        if(iDigit == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        boolean bRet = false;

        logic lobj = new logic();
        bRet = lobj.CheckPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("The is Palindrome.");
        }
        else
        {
            System.out.println("The number is not Palindrome.");
        }

    }    

} 