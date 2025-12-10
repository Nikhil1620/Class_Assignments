//Sum of even factors (exclude the number itself

#include<stdio.h>

int Display(int iNo)
{
    int iCnt = 0;
    int iAdd = 0;

    for(iCnt = 2; iCnt <= iNo; iCnt = iCnt + 2)
    {
        if(iNo % iCnt == 0)
        {
            iAdd = iAdd + iCnt;
        }
    }
    return iAdd;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    printf("The Addition is : %d\n", iResult);
    
    return 0;

}
