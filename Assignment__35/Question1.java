import java.util.*;

class Alphabet
{
    public void DisplayASCII()
    {
        for(int i = 0; i <= 255; i++)
        {
            if(i >= 32 && i <= 126)  
            {
                System.out.println(i +" "+ (char)i);
            }
            else
            {
                System.out.println(i + " (Non Printable)");
            }
        }
    }
}

class Question1
{
    public static void main(String args[])
    {
        Alphabet aobj = new Alphabet();
        aobj.DisplayASCII();
    }
}
