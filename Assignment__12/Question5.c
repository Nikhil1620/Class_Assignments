//Check if number is divisible by 5

#include<stdio.h>
#include<stdbool.h>

bool DivisibleByFive(int iNo)
{
    if(iNo % 5 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }    
}

int main()
{
    int iValue = 0;
    bool iResult = false;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = DivisibleByFive(iValue);

    if(iResult == true)
    {
        printf("The number is divisible by five.");
    }
    else
    {
        printf("The Number is not divisible by five");
    }

    return 0;

}
