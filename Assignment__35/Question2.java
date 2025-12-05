import java.util.*;

class Alphabet
{
    public void Check(char chh)
    {
        if((chh >= 'A' && chh <= 'Z'))
        {
            chh = (char)(chh + 32);                //Need to remember
            System.out.println(chh);
        }
        else if((chh >= 'a' && chh <= 'z'))
        {
            chh = (char)(chh - 32);                //Need to Remember
            System.out.println(chh);
        }
        else
        {
            System.out.println(chh);
        }
    }
}
class Question2
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the input : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        Alphabet aobj = new Alphabet();

        aobj.Check(ch);

    }
}