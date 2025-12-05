#include<stdio.h>
#include<stdbool.h>

void Display(char chh)
{
    if(chh >= 'A' && chh <= 'Z')
    {
        while(chh <= 'Z')
        {
            printf("%c\t",chh);
            chh++;
        }
    }
    else if((chh >= 'a' && chh <= 'z'))
    {
        while(chh <= 'z')
        {
            printf("%c\t",chh);
            chh++;
        }
    }
    else
    {
        printf("Invalid input");
    }

}

int main()
{
    char ch = '\0';

    printf("Enter the Character : \n");
    scanf("%c",&ch);

    Display(ch);

    return 0;
}