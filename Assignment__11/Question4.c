#include<stdio.h>

int DisplayAddition(int iNo1, int iNo2)
{
    int iCnt = 0;
    int iAdd = 0;

    for(iCnt = iNo1; iCnt <= iNo2; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iAdd = iAdd + iCnt;
        }
    }
    
    return iAdd;
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    int iAddition = 0;

    printf("Enter the first number : \n");
    scanf("%d", &iValue1);

    printf("Enter the Second number : \n");
    scanf("%d", &iValue2);

    iAddition = DisplayAddition(iValue1, iValue2);

    printf("The Addition is : %d\n", iAddition);

    return 0;
}