import java.util.Scanner;

class function
{
    char checkintegertype(int iNo)
    {
        if(iNo > 0)
        {
            return 'P';
        }
        else if(iNo < 0)
        {
           return 'N'; 
        }
        else
        {
            return 'Z';
        }
    }
}

class Question5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        char cResult = 0;

        function fobj = new function();
        
        cResult = fobj.checkintegertype(iValue);

        if(cResult == 'P')
        {
            System.out.println("The number is Positive.");
        }
        else if(cResult == 'N')
        {
            System.out.println("The number is Negative.");
        }
        else
        {
            System.out.println("The number is Zero.");
        }
    }
}
