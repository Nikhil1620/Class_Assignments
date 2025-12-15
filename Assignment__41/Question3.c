#include<stdio.h>

int StrLen(char *str)
{
    if(*str == '\0') 
    {
        return 0;
    }

    return 1 + StrLen(str + 1);
}

int main()
{
    char str[50];
    int iResult = 0;

    printf("Enter the string : ");
    scanf("%s", str);

    iResult = StrLen(str);

    printf("Length of string is : %d", iResult);

    return 0;
}
