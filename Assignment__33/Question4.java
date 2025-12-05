import java.util.*;

class Alphabet
{
    public boolean Check(char chh)
    {
        if((chh >= 97 && chh <= 122))
        {
            return true;
        }
        else
        {
            return false;
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

        bRet = aobj.Check(ch);

        if(bRet == true)
        {
            System.out.println("It is in small case");
        }
        else
        {
            System.out.println("It is not in small case");
        }

    }
}