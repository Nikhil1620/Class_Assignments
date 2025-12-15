#include<Stdio.h>
#include<stdbool.h>

void Display(int iNo)
{
    if(iNo == 0)
    {
        return;
    }

    printf("*\t");
    Display(iNo - 1);
}

int main()
{
    int iValue = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}
