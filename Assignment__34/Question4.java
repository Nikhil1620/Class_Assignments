import java.util.*;

class Alphabet
{
    public boolean Display(char chh)
    {
        if((chh >= 'A' && chh <= 'Z'))
        {
            return false;
        }
        else if((chh >= 'a' && chh <= 'z'))
        {
            return false;
        }
        else if((chh >= '0' && chh <= '9'))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
class Question4
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the input : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        Alphabet aobj = new Alphabet();

        bRet = aobj.Display(ch);

        if(bRet == true)
        {
            System.out.println("It is a Special symbol.");
        }
        else
        {
            System.out.println("It is not a Special symbol.");

        }

    }
}