#include<stdio.h>

int Display(int iNo)
{
    int iCnt = 0;
    int iFactCount = 0;

    for(iCnt = 1; iCnt <= iNo/2; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iFactCount++;
        }
    }
    return iFactCount;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    printf("The number of factors are : %d\n", iResult);
    
    return 0;
}