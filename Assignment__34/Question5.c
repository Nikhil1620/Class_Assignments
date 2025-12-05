#include<stdio.h>

void DisplayASCII(char ch)
{
    printf("Decimal     : %d\n", ch);
    printf("Octal       : %o\n", ch);
    printf("Hexadecimal : %X\n", ch);
}

int main()
{
    char ch;

    printf("\nEnter any character: ");
    scanf(" %c", &ch);

    DisplayASCII(ch);

    return 0;
}
