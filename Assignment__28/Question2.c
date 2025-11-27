/*
    2. Accept number of rows and number of columns from user and display below
    pattern.
    Input : iRow = 4 iCol = 4
    Output : A B C D
             a b c d
             A B C D
             a b c d 
*/
#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0;
    int j = 0;

    for(i = 1; i <= iRow; i++)
    {
        char ch1 = 'A';
        char ch2 = 'a';

        for(j = 1; j <= iCol; j++)
        {
            if(i % 2 != 0)
            {
                printf("%c\t",ch1);
                ch1++;
            }
            else
            {
                printf("%c\t",ch2);
                ch2++;
            }
        }
        printf("\n");
    }
}


int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter the number of rows : \n");
    scanf("%d",&iValue1);

    printf("Enter the number of coloumns : \n");
    scanf("%d",&iValue2);

    Display(iValue1, iValue2);

    return 0;

}
