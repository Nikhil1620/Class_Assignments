#include<stdio.h>

void Display(char ch)
{
    if(ch > 'f')   
    {
        return;
    }

    printf("%c\t", ch);
    Display(ch + 1);     
}

int main()
{
    char cValue;

    printf("Enter the Character : ");
    scanf(" %c", &cValue);  

    Display(cValue);

    return 0;
}
