//Write a program to check whether a given year is a leap year or not.
    
import java.util.Scanner;

class Function
{
    void CheckLeap(int iNo)
    {
        if(iNo % 4 == 0)
        {
            System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("The year is not a leap year.");
        }
    }
}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Year : ");

        int iyear = sobj.nextInt();

        Function fobj = new Function();

        fobj.CheckLeap(iyear);
    }

}
