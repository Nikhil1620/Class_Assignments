import java.util.*;

class Alphabet
{
    public void Display(char chh)
    {
        if(chh >= 'A' && chh <= 'Z')
        {
            while(chh <= 'Z')
            {
                System.out.print(chh+"\t");
                chh++;
            }
        }
        else if((chh >= 'a' && chh <= 'z'))
        {
            while(chh <= 'z')
            {
                System.out.print(chh+"\t");
                chh++;
            }
        }
        else
        {
            System.out.print("Invalid input");
        }
    }
}
class Question3
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the input : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        Alphabet aobj = new Alphabet();

        aobj.Display(ch);

    }
}