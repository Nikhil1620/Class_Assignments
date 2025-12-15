#include<stdio.h>

int Product(int iNo)
{
    if(iNo == 0) 
    {
        return 1;
    }

    return (iNo % 10) * Product(iNo / 10);
}

int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    iResult = Product(iValue);

    printf("Product of digits is : %d", iResult);

    return 0;
}
