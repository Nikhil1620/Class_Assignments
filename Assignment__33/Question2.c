#include<stdio.h>
#include<stdbool.h>

bool check(char *str)
{
    while(*str != '\0')
    {
        if((*str >= 'A' && *str <= 'Z'))
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

    bRet = check(Arr);

    if(bRet == true)
    {
        printf("It is a Capital Alphabet.");
    }
    else
    {
        printf("It is not a Capital Alphabet");
    }

    return 0;
}