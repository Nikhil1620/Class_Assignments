#include<stdio.h>
#include<stdbool.h>

bool check(char *str)
{
    while(*str != '\0')
    {
        if((*str >= 'A' && *str <= 'Z') || (*str >= 'a' && *str <= 'z') )
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
        printf("It is Alphabet.");
    }
    else
    {
        printf("It is not an Alphabet");
    }

    return 0;
}