//Write a program which accept number from user and return difference between summation of even digits and summation of odd digits

#include<stdio.h>
#include<stdbool.h>

int Display(int iNo)
{
    int iDigit = 0;
    int iEvenSum = 0;
    int iOddSum = 0;
    int iDifference = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo !=0)
    {
        iDigit = iNo % 10;  
        if(iDigit % 2 == 0)
        {
            iEvenSum = iEvenSum + iDigit;
        }
        else
        {
            iOddSum = iOddSum + iDigit;
        }                    
        iNo = iNo / 10;  

        iDifference = iEvenSum - iOddSum;

        if(iDifference < 0)
        {
            iDifference = -iDifference;
        }
    }

    return iDifference;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    printf("The difference is : %d\n", iResult);
    
    return 0;
}

