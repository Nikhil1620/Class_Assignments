#include<stdio.h>

int SumDigits(int iNo)
{
    if(iNo == 0) 
    {
        return 0;
    }

    return (iNo % 10) + SumDigits(iNo / 10);
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    iResult = SumDigits(iValue);

    printf("Sum of digits is : %d", iResult);

    return 0;
}
