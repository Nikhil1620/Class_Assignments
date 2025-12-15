#include<stdio.h>

void Display(int iNo, char ch)
{
    if(iNo == 0)   
    {
        return;
    }

    printf("%c\t", ch);     
    Display(iNo - 1, ch + 1); 
}

int main()
{
    int iValue = 0;
    char cValue = '\0';

    printf("Enter the number : ");
    scanf("%d", &iValue);

    printf("Enter the Character : ");
    scanf(" %c", &cValue);

    Display(iValue, cValue);

    return 0;
}
