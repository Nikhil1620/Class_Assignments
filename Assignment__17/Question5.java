import java.util.Scanner;

class logic
{
    void DisplayTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt <= (iNo*10); iCnt = iCnt + iNo)
        {
            System.out.println(iCnt);
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

        int iResult = 0;

        logic lobj = new logic();
        lobj.DisplayTable(iValue);

    }    

} 