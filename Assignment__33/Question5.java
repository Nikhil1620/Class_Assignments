import java.util.*;

class School
{
    public void ExamSchedule(char chh)
    {
        if(chh == 'A' || chh == 'a') 
    {
        System.out.println("Your exam is at 7:30AM");
    }
    else if(chh == 'B' || chh == 'b')
    {
        System.out.println("Your exam is at 8:30AM");
    }
    else if(chh == 'C' || chh == 'c')
    {
        System.out.println("Your exam is at 9:30AM");
    }
    else if(chh == 'D' || chh == 'd')
    {
        System.out.println("Your exam is at 10:30AM");
    }
    else
    {
        System.out.println("Invalid Division");;
    }
    }
}
class Question5
{
    public static void main(String A[])
    {

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the input : ");

        char ch = scanobj.next().charAt(0);               //Need to remember

        School aobj = new School();

        aobj.ExamSchedule(ch);

    }
}