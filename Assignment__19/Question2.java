import java.util.Scanner;

class Function
{
    void DisplayGrade(int iNo)
    {
        if(iNo > 100 | iNo < 0)
        {
            System.out.println("Invalid Marks");
        }

        if(iNo >= 90)
        {
            System.out.println("Grade A");
        }
        else if(iNo >= 60 && iNo <= 89)
        {
            System.out.println("Grade B");
        }
        else if(iNo >= 35 && iNo <= 59)
        {
            System.out.println("Grade C");   
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Marks : ");

        int iMarks = sobj.nextInt();

        Function fobj = new Function();

        fobj.DisplayGrade(iMarks);
    }
}