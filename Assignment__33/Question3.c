#include<stdio.h>
#include<stdbool.h>

bool checkDigit(char *str)
{
    while(*str != '\0')
    {
        if((*str >= 48 && *str <= 57))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

int main()
{
    char Arr[50] = "\0";
    bool bRet = false;

    printf("Enter the String : \n");
    scanf("%[^\n]s",Arr);

    bRet = checkDigit(Arr);

    if(bRet == true)
    {
        printf("It is a Digit.");
    }
    else
    {
        printf("It is not a Digit");
    }

    return 0;
}