import java.util.*;

class Alphabet
{
    public boolean Check(char chh)
    {
        if((chh >= 'A' && chh <= 'Z'))
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
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the Character : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        Alphabet aobj = new Alphabet();

        bRet = aobj.Check(ch);

        if(bRet == true)
        {
            System.out.println("It is a Capital Alphabet.");
        }
        else
        {
            System.out.println("It is not a Capital Alphabet.");
        }

    }
}