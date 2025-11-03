#include<stdio.h>
#include<stdbool.h>

int Display(int iNo)
{
    int iDigit = 0;
    int Frequency = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo !=0)
    {
        iDigit = iNo % 10;

        if(iDigit >= 3 && iDigit <= 7) 
        {                       
            Frequency = Frequency + 1;
        }                       
        iNo = iNo / 10;  
    }

    return Frequency;
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    printf("The count is : %d\n", iResult);
    
    return 0;
}
