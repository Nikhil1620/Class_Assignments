#include<stdio.h>
#include<stdbool.h>

void Display(char *str)
{
    
    if((*str >= 'A' && *str <= 'Z'))
    {
        *str = *str + 32;
        printf("%c",*str);
    }
    else
    {
        *str = *str - 32;
        printf("%c",*str);
    }

}

int main()
{
    char Arr[50] = "\0";

    printf("Enter the String : \n");
    scanf("%[^\n]s",Arr);

    Display(Arr);

    return 0;
}