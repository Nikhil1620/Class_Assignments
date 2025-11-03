#include<stdio.h>

int NumAddition(int iNo)
{
    int iCnt = 0;
    int iAdd = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        iAdd = iAdd + iCnt;
    }

    return iAdd;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = NumAddition(iValue);

    printf("The Addition is : %d\n", iResult);

    return 0;
}