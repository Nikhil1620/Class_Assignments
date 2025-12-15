#include<stdio.h>

int Factorial(int iNo)
{
    if(iNo == 0) 
    {
        return 1;
    }

    return iNo * Factorial(iNo - 1);
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    iResult = Factorial(iValue);

    printf("Factorial is : %d", iResult);

    return 0;
}
