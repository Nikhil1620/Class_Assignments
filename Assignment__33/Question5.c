#include<stdio.h>
#include<stdbool.h>

void ExamSchedule(char *str)
{
    if(*str == 'A' || *str == 'a') 
    {
        printf("Your exam is at 7:30AM");
    }
    else if(*str == 'B' || *str == 'b')
    {
        printf("Your exam is at 8:30AM");
    }
    else if(*str == 'C' || *str == 'c')
    {
        printf("Your exam is at 9:30AM");
    }
    else if(*str == 'D' || *str == 'd')
    {
        printf("Your exam is at 10:30AM");
    }
    else
    {
        printf("Invalid Division");;
    }
    
}

int main()
{
    char Arr[50] = "\0";

    printf("Enter the String : \n");
    scanf("%[^\n]s",Arr);

    ExamSchedule(Arr);

    return 0;
}