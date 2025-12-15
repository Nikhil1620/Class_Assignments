#include<Stdio.h>

void Display(int iNo)
{
    if(iNo == 0)
    {
        return;
    }

    Display(iNo - 1);
    printf("%d\t",iNo);
}

int main()
{
    int iValue = 0;

    printf("Enter the number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}
