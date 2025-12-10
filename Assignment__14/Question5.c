//Write a program which accept number from user and count frequency of such a digits which are less than 6. 

#include<stdio.h>
#include<stdbool.h>

int Display(int iNo)
{
    int iDigit = 0;
    int FreqTwo = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo !=0)
    {
        iDigit = iNo % 10;

        if(iDigit < 6) 
        {                       
            FreqTwo = FreqTwo + 1;
        }                       
        iNo = iNo / 10;  
    }

    return FreqTwo;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    printf("The number of two's are : %d\n", iResult);
    
    return 0;
}

