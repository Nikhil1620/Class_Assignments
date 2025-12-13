//Write a program to calculate the sum of first N natural numbers.

class logic
{
    int calculateSum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        
        return iSum;
    }

}

class Question1
{
    public static void main(String A[])
    {
        int iRet = 0;

        logic lobj = new logic();
        iRet = lobj.calculateSum(10);

        System.out.println("The Sum is " + iRet);
    }

}
