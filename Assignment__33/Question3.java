import java.util.*;

class Digit
{
    public boolean Check(char chh)
    {
        if((chh >= 48 && chh <= 57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Question3
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the input : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        Digit aobj = new Digit();

        bRet = aobj.Check(ch);

        if(bRet == true)
        {
            System.out.println("It is a Digit");
        }
        else
        {
            System.out.println("It is not a Digit");
        }

    }
}