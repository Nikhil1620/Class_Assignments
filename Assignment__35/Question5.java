import java.util.Scanner;

class ASCII
{
    public void DisplayASCII(char ch)
    {
        System.out.println("Decimal     : " + (int)ch);
        System.out.println("Octal       : " + Integer.toOctalString(ch));
        System.out.println("Hexadecimal : " + Integer.toHexString(ch).toUpperCase());
    }
}

public class Question5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any character: ");
        char ch = scan.next().charAt(0);

        ASCII obj = new ASCII();
        obj.DisplayASCII(ch);
    }
}
